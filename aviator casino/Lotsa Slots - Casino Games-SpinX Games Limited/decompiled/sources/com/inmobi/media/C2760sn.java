package com.inmobi.media;

/* renamed from: com.inmobi.media.sn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2760sn {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f5453a;
    public final android.widget.RelativeLayout b;
    public final com.inmobi.media.Og c;
    public final kotlinx.coroutines.flow.MutableSharedFlow d;
    public android.widget.ProgressBar e;
    public kotlinx.coroutines.Job f;

    public C2760sn(kotlinx.coroutines.CoroutineScope coroutineScope, android.widget.RelativeLayout experienceLayout, com.inmobi.media.Og progressConfig, kotlinx.coroutines.flow.MutableSharedFlow mediaPlayerFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experienceLayout, "experienceLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaPlayerFlow, "mediaPlayerFlow");
        this.f5453a = coroutineScope;
        this.b = experienceLayout;
        this.c = progressConfig;
        this.d = mediaPlayerFlow;
    }
}
