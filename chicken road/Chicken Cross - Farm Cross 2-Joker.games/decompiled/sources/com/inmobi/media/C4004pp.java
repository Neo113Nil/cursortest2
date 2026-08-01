package com.inmobi.media;

import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.pp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4004pp {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f7314a;
    public final RelativeLayout b;
    public final Xh c;
    public final MutableSharedFlow d;
    public ProgressBar e;
    public Job f;

    public C4004pp(CoroutineScope coroutineScope, RelativeLayout experienceLayout, Xh progressConfig, MutableSharedFlow mediaPlayerFlow) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(experienceLayout, "experienceLayout");
        Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        Intrinsics.checkNotNullParameter(mediaPlayerFlow, "mediaPlayerFlow");
        this.f7314a = coroutineScope;
        this.b = experienceLayout;
        this.c = progressConfig;
        this.d = mediaPlayerFlow;
    }
}
