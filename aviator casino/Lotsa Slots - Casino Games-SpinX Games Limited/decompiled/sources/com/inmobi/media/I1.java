package com.inmobi.media;

/* loaded from: classes5.dex */
public final class I1 implements kotlin.properties.ReadOnlyProperty {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f4754a;
    public final boolean b;
    public volatile java.lang.Object c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public boolean e;

    public /* synthetic */ I1(java.lang.Integer num, kotlin.jvm.functions.Function0 function0, int i) {
        this(num, function0, (i & 4) == 0, false);
    }

    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.e = true;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.H1(this, null), 3, null);
        }
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final java.lang.Object getValue(java.lang.Object obj, kotlin.reflect.KProperty property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "property");
        if (this.b || !this.e) {
            a();
        }
        return this.c;
    }

    public I1(java.lang.Object obj, kotlin.jvm.functions.Function0 refreshLogic, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshLogic, "refreshLogic");
        this.f4754a = refreshLogic;
        this.b = z;
        this.c = obj;
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        if (z2) {
            a();
        }
    }
}
