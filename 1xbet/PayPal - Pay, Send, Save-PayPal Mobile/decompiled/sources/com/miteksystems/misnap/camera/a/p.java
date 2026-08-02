package com.miteksystems.misnap.camera.a;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004B*\u0012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016R/\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/miteksystems/misnap/camera/a/p;", "Landroidx/core/util/Consumer;", "Landroidx/camera/video/VideoRecordEvent;", "", "a", "()V", "t", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "event", "Lkotlin/jvm/functions/Function1;", "onEvent", "", util.h.xy.cb.b.f1091, "Z", "isEnabled", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "c", "camera_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class p implements androidx.core.util.Consumer<androidx.camera.video.VideoRecordEvent> {
    private static final com.miteksystems.misnap.camera.a.p.a getHighSpeedVideoFpsRanges = new com.miteksystems.misnap.camera.a.p.a(0);
    private final kotlin.jvm.functions.Function1<androidx.camera.video.VideoRecordEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    @Override // androidx.core.util.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(androidx.camera.video.VideoRecordEvent t) {
        if (t == null || !this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.invoke(t);
    }

    public final /* synthetic */ void a() {
        this.getHighSpeedVideoSizes = false;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/camera/a/p$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "camera_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes10.dex */
    static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(kotlin.jvm.functions.Function1<? super androidx.camera.video.VideoRecordEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoSizes = true;
    }
}
