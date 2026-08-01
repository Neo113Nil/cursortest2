package com.unity3d.ads.core.domain;

import android.opengl.GLES20;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gl.EglCore;
import com.unity3d.ads.gl.OffscreenSurface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: AndroidGetOpenGLRendererInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetOpenGLRendererInfo;", "Lcom/unity3d/ads/core/domain/GetOpenGLRendererInfo;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "Lcom/google/protobuf/ByteString;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidGetOpenGLRendererInfo implements GetOpenGLRendererInfo {
    private final SessionRepository sessionRepository;

    public AndroidGetOpenGLRendererInfo(SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetOpenGLRendererInfo
    public ByteString invoke() {
        if (this.sessionRepository.getFeatureFlags().getOpenglGpuEnabled()) {
            EglCore eglCore = new EglCore(null, 2);
            OffscreenSurface offscreenSurface = new OffscreenSurface(eglCore, 1, 1);
            offscreenSurface.makeCurrent();
            String glGetString = GLES20.glGetString(7937);
            Intrinsics.checkNotNull(glGetString);
            byte[] bytes = glGetString.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            ByteString copyFrom = ByteString.copyFrom(bytes);
            offscreenSurface.release();
            eglCore.release();
            Intrinsics.checkNotNull(copyFrom);
            return copyFrom;
        }
        ByteString empty = ByteString.empty();
        Intrinsics.checkNotNull(empty);
        return empty;
    }
}
