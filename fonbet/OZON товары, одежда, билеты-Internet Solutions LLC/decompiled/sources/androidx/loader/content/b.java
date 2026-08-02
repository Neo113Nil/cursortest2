package androidx.loader.content;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.loader.app.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes8.dex */
public class b<D> {
    private Context mContext;
    private int mId;
    private InterfaceC0804b<D> mListener;
    private a<D> mOnLoadCanceledListener;
    private boolean mStarted = false;
    private boolean mAbandoned = false;
    private boolean mReset = true;
    private boolean mContentChanged = false;
    private boolean mProcessingChange = false;

    public interface a<D> {
    }

    /* renamed from: androidx.loader.content.b$b, reason: collision with other inner class name */
    public interface InterfaceC0804b<D> {
    }

    public b(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    @NonNull
    public String dataToString(D d11) {
        StringBuilder sb2 = new StringBuilder(64);
        if (d11 == null) {
            sb2.append("null");
        } else {
            Class<?> cls = d11.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}");
        }
        return sb2.toString();
    }

    public void deliverCancellation() {
    }

    public void deliverResult(D d11) {
        InterfaceC0804b<D> interfaceC0804b = this.mListener;
        if (interfaceC0804b != null) {
            b.a aVar = (b.a) interfaceC0804b;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                aVar.setValue(d11);
            } else {
                aVar.postValue(d11);
            }
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    protected void onAbandon() {
    }

    protected boolean onCancelLoad() {
        return false;
    }

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    protected void onForceLoad() {
    }

    protected void onReset() {
    }

    protected void onStartLoading() {
    }

    protected void onStopLoading() {
    }

    public void registerListener(int i11, @NonNull InterfaceC0804b<D> interfaceC0804b) {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mListener = interfaceC0804b;
        this.mId = i11;
    }

    public void registerOnLoadCanceledListener(@NonNull a<D> aVar) {
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z11 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z11;
        return z11;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        return K00.b.e(this.mId, "}", sb2);
    }

    public void unregisterListener(@NonNull InterfaceC0804b<D> interfaceC0804b) {
        InterfaceC0804b<D> interfaceC0804b2 = this.mListener;
        if (interfaceC0804b2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0804b2 != interfaceC0804b) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    public void unregisterOnLoadCanceledListener(@NonNull a<D> aVar) {
        throw new IllegalStateException("No listener register");
    }
}
