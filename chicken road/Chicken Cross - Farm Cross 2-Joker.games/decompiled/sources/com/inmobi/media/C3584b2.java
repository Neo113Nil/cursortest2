package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.b2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3584b2 implements ReadOnlyProperty {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f7022a;
    public final boolean b;
    public volatile Object c;
    public final AtomicBoolean d;
    public boolean e;

    public /* synthetic */ C3584b2(Object obj, Function0 function0, int i) {
        this(obj, function0, (i & 4) == 0, false);
    }

    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.e = true;
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C3556a2(this, null), 3, null);
        }
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.b || !this.e) {
            a();
        }
        return this.c;
    }

    public C3584b2(Object obj, Function0 refreshLogic, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(refreshLogic, "refreshLogic");
        this.f7022a = refreshLogic;
        this.b = z;
        this.c = obj;
        this.d = new AtomicBoolean(false);
        if (z2) {
            a();
        }
    }
}
