package androidx.camera.extensions.internal.sessionprocessor;

import S.d;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.impl.K0;
import androidx.camera.core.impl.Q0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.r;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import v.E0;

/* loaded from: classes8.dex */
public final class AdvancedSessionProcessor extends g {

    private static class CallbackAdapter implements K0.a {
        private final RequestProcessorImpl.Callback mCallback;

        CallbackAdapter(@NonNull RequestProcessorImpl.Callback callback) {
            this.mCallback = callback;
        }

        private RequestProcessorImpl.Request getImplRequest(K0.b bVar) {
            x2.i.b(bVar instanceof RequestAdapter);
            return ((RequestAdapter) bVar).getImplRequest();
        }

        @Override // androidx.camera.core.impl.K0.a
        public void onCaptureBufferLost(@NonNull K0.b bVar, long j11, int i11) {
            this.mCallback.onCaptureBufferLost(getImplRequest(bVar), j11, i11);
        }

        @Override // androidx.camera.core.impl.K0.a
        public void onCaptureCompleted(@NonNull K0.b bVar, InterfaceC5130z interfaceC5130z) {
            CaptureResult g10 = interfaceC5130z.g();
            x2.i.a("CaptureResult in cameraCaptureResult is not a TotalCaptureResult", g10 instanceof TotalCaptureResult);
            this.mCallback.onCaptureCompleted(getImplRequest(bVar), (TotalCaptureResult) g10);
        }

        @Override // androidx.camera.core.impl.K0.a
        public void onCaptureFailed(@NonNull K0.b bVar, r rVar) {
            Object a11 = rVar.a();
            x2.i.a("CameraCaptureFailure does not contain CaptureFailure.", Objects.nonNull(a11));
            this.mCallback.onCaptureFailed(getImplRequest(bVar), (CaptureFailure) a11);
        }

        @Override // androidx.camera.core.impl.K0.a
        public void onCaptureProgressed(@NonNull K0.b bVar, @NonNull InterfaceC5130z interfaceC5130z) {
            CaptureResult g10 = interfaceC5130z.g();
            x2.i.a("Cannot get CaptureResult from the cameraCaptureResult ", g10 != null);
            this.mCallback.onCaptureProgressed(getImplRequest(bVar), g10);
        }

        @Override // androidx.camera.core.impl.K0.a
        public void onCaptureSequenceAborted(int i11) {
            this.mCallback.onCaptureSequenceAborted(i11);
        }

        @Override // androidx.camera.core.impl.K0.a
        public void onCaptureSequenceCompleted(int i11, long j11) {
            this.mCallback.onCaptureSequenceCompleted(i11, j11);
        }

        @Override // androidx.camera.core.impl.K0.a
        public void onCaptureStarted(@NonNull K0.b bVar, long j11, long j12) {
            this.mCallback.onCaptureStarted(getImplRequest(bVar), j11, j12);
        }
    }

    private static class ExtensionMetadataMonitor {
        private final V<Integer> mCurrentExtensionTypeLiveData;
        private final V<Integer> mExtensionStrengthLiveData;

        ExtensionMetadataMonitor(V<Integer> v11, V<Integer> v12) {
            this.mCurrentExtensionTypeLiveData = v11;
            this.mExtensionStrengthLiveData = v12;
        }

        private int convertExtensionMode(int i11) {
            if (i11 == 0) {
                return 5;
            }
            if (i11 == 1) {
                return 4;
            }
            if (i11 == 2) {
                return 1;
            }
            if (i11 != 3) {
                return i11 != 4 ? 0 : 3;
            }
            return 2;
        }

        void checkExtensionMetadata(Map<CaptureResult.Key, Object> map) {
            CaptureResult.Key key;
            CaptureResult.Key key2;
            if (Build.VERSION.SDK_INT >= 34) {
                if (this.mCurrentExtensionTypeLiveData != null) {
                    key2 = CaptureResult.EXTENSION_CURRENT_TYPE;
                    Object obj = map.get(key2);
                    if (obj != null) {
                        Integer num = (Integer) obj;
                        if (!Objects.equals(this.mCurrentExtensionTypeLiveData.getValue(), Integer.valueOf(convertExtensionMode(num.intValue())))) {
                            this.mCurrentExtensionTypeLiveData.postValue(Integer.valueOf(convertExtensionMode(num.intValue())));
                        }
                    }
                }
                if (this.mExtensionStrengthLiveData != null) {
                    key = CaptureResult.EXTENSION_STRENGTH;
                    Object obj2 = map.get(key);
                    if (obj2 == null || Objects.equals(this.mExtensionStrengthLiveData.getValue(), obj2)) {
                        return;
                    }
                    this.mExtensionStrengthLiveData.postValue((Integer) obj2);
                }
            }
        }
    }

    private static class ImageProcessorAdapter {
        private final ImageProcessorImpl mImpl;

        ImageProcessorAdapter(ImageProcessorImpl imageProcessorImpl) {
            this.mImpl = imageProcessorImpl;
        }

        public void onNextImageAvailable(int i11, long j11, @NonNull d dVar, String str) {
            this.mImpl.onNextImageAvailable(i11, j11, new ImageReferenceImplAdapter(dVar), str);
        }
    }

    private static class ImageReferenceImplAdapter implements ImageReferenceImpl {
        private final d mImageReference;

        ImageReferenceImplAdapter(d dVar) {
            this.mImageReference = dVar;
        }

        public boolean decrement() {
            return this.mImageReference.b();
        }

        public Image get() {
            return this.mImageReference.get();
        }

        public boolean increment() {
            return this.mImageReference.a();
        }
    }

    private static class OutputSurfaceConfigurationImplAdapter implements OutputSurfaceConfigurationImpl {
        private final OutputSurfaceImpl mAnalysisOutputSurface;
        private final OutputSurfaceImpl mCaptureOutputSurface;
        private final OutputSurfaceImpl mPostviewOutputSurface;
        private final OutputSurfaceImpl mPreviewOutputSurface;

        OutputSurfaceConfigurationImplAdapter(@NonNull C0 c02) {
            this.mPreviewOutputSurface = new OutputSurfaceImplAdapter(c02.e());
            this.mCaptureOutputSurface = new OutputSurfaceImplAdapter(c02.c());
            this.mAnalysisOutputSurface = c02.b() != null ? new OutputSurfaceImplAdapter(c02.b()) : null;
            this.mPostviewOutputSurface = c02.d() != null ? new OutputSurfaceImplAdapter(c02.d()) : null;
        }

        public OutputSurfaceImpl getImageAnalysisOutputSurface() {
            return this.mAnalysisOutputSurface;
        }

        @NonNull
        public OutputSurfaceImpl getImageCaptureOutputSurface() {
            return this.mCaptureOutputSurface;
        }

        public OutputSurfaceImpl getPostviewOutputSurface() {
            return this.mPostviewOutputSurface;
        }

        @NonNull
        public OutputSurfaceImpl getPreviewOutputSurface() {
            return this.mPreviewOutputSurface;
        }
    }

    private static class OutputSurfaceImplAdapter implements OutputSurfaceImpl {
        private final B0 mOutputSurface;

        OutputSurfaceImplAdapter(B0 b02) {
            this.mOutputSurface = b02;
        }

        public int getImageFormat() {
            return this.mOutputSurface.b();
        }

        @NonNull
        public Size getSize() {
            return this.mOutputSurface.c();
        }

        @NonNull
        public Surface getSurface() {
            return this.mOutputSurface.d();
        }
    }

    private static class RequestAdapter implements K0.b {
        private final RequestProcessorImpl.Request mImplRequest;
        private final T mParameters;
        private final List<Integer> mTargetOutputConfigIds;
        private final int mTemplateId;

        RequestAdapter(@NonNull RequestProcessorImpl.Request request) {
            this.mImplRequest = request;
            ArrayList arrayList = new ArrayList();
            Iterator it = request.getTargetOutputConfigIds().iterator();
            while (it.hasNext()) {
                arrayList.add((Integer) it.next());
            }
            this.mTargetOutputConfigIds = arrayList;
            d.a aVar = new d.a();
            for (CaptureRequest.Key key : request.getParameters().keySet()) {
                aVar.b(key, request.getParameters().get(key));
            }
            this.mParameters = aVar.a();
            this.mTemplateId = request.getTemplateId().intValue();
        }

        public RequestProcessorImpl.Request getImplRequest() {
            return this.mImplRequest;
        }

        @Override // androidx.camera.core.impl.K0.b
        @NonNull
        public T getParameters() {
            return this.mParameters;
        }

        @Override // androidx.camera.core.impl.K0.b
        @NonNull
        public List<Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        @Override // androidx.camera.core.impl.K0.b
        public int getTemplateId() {
            return this.mTemplateId;
        }
    }

    private static class SessionProcessorImplCaptureCallbackAdapter implements SessionProcessorImpl.CaptureCallback {
        private final Q0.a mCaptureCallback;
        private final ExtensionMetadataMonitor mExtensionMetadataMonitor;
        private long mOnCaptureStartedTimestamp;

        @NonNull
        private final X0 mTagBundle;
        private boolean mWillReceiveOnCaptureCompleted;

        SessionProcessorImplCaptureCallbackAdapter(@NonNull Q0.a aVar, @NonNull X0 x02, boolean z11) {
            this(aVar, x02, null, z11);
        }

        public void onCaptureCompleted(long j11, int i11, Map<CaptureResult.Key, Object> map) {
            ExtensionMetadataMonitor extensionMetadataMonitor = this.mExtensionMetadataMonitor;
            if (extensionMetadataMonitor != null) {
                extensionMetadataMonitor.checkExtensionMetadata(map);
            }
            if (this.mWillReceiveOnCaptureCompleted) {
                this.mCaptureCallback.c(new e(j11, this.mTagBundle, map));
                this.mCaptureCallback.a();
            }
        }

        public void onCaptureFailed(int i11) {
            this.mCaptureCallback.b();
        }

        public void onCaptureProcessProgressed(int i11) {
            this.mCaptureCallback.getClass();
        }

        public void onCaptureProcessStarted(int i11) {
            this.mCaptureCallback.getClass();
        }

        public void onCaptureSequenceAborted(int i11) {
            this.mCaptureCallback.getClass();
        }

        public void onCaptureSequenceCompleted(int i11) {
            if (this.mWillReceiveOnCaptureCompleted) {
                return;
            }
            this.mCaptureCallback.c(new e(this.mOnCaptureStartedTimestamp, this.mTagBundle, Collections.EMPTY_MAP));
            this.mCaptureCallback.a();
        }

        public void onCaptureStarted(int i11, long j11) {
            this.mOnCaptureStartedTimestamp = j11;
            this.mCaptureCallback.onCaptureStarted();
        }

        SessionProcessorImplCaptureCallbackAdapter(@NonNull Q0.a aVar, @NonNull X0 x02, ExtensionMetadataMonitor extensionMetadataMonitor, boolean z11) {
            this.mOnCaptureStartedTimestamp = -1L;
            this.mCaptureCallback = aVar;
            this.mTagBundle = x02;
            this.mExtensionMetadataMonitor = extensionMetadataMonitor;
            this.mWillReceiveOnCaptureCompleted = z11;
        }
    }

    private class RequestProcessorImplAdapter implements RequestProcessorImpl {
        private final K0 mRequestProcessor;
        final /* synthetic */ AdvancedSessionProcessor this$0;

        RequestProcessorImplAdapter(@NonNull AdvancedSessionProcessor advancedSessionProcessor, K0 k02) {
            this.mRequestProcessor = k02;
        }

        public void abortCaptures() {
            ((E0) this.mRequestProcessor).a();
        }

        public void setImageProcessor(int i11, @NonNull ImageProcessorImpl imageProcessorImpl) {
            new ImageProcessorAdapter(imageProcessorImpl);
            throw null;
        }

        public int setRepeating(@NonNull RequestProcessorImpl.Request request, @NonNull RequestProcessorImpl.Callback callback) {
            return ((E0) this.mRequestProcessor).f(new RequestAdapter(request), new CallbackAdapter(callback));
        }

        public void stopRepeating() {
            ((E0) this.mRequestProcessor).g();
        }

        public int submit(@NonNull RequestProcessorImpl.Request request, @NonNull RequestProcessorImpl.Callback callback) {
            K0 k02 = this.mRequestProcessor;
            RequestAdapter requestAdapter = new RequestAdapter(request);
            CallbackAdapter callbackAdapter = new CallbackAdapter(callback);
            E0 e02 = (E0) k02;
            e02.getClass();
            return e02.h(Arrays.asList(requestAdapter), callbackAdapter);
        }

        public int submit(@NonNull List<RequestProcessorImpl.Request> list, @NonNull RequestProcessorImpl.Callback callback) {
            ArrayList arrayList = new ArrayList();
            Iterator<RequestProcessorImpl.Request> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new RequestAdapter(it.next()));
            }
            return ((E0) this.mRequestProcessor).h(arrayList, new CallbackAdapter(callback));
        }
    }
}
