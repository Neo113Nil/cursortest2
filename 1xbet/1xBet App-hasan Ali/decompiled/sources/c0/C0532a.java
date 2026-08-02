package c0;

import W3.o;
import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import e2.C1930k;
import kotlin.jvm.internal.m;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532a extends m implements i4.g {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0533b f7376l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f7377m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0532a(C0533b c0533b, int i) {
        super(4);
        this.f7376l = c0533b;
        this.f7377m = i;
    }

    @Override // i4.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        C0533b c0533b = this.f7376l;
        C1930k c1930k = c0533b.f7378a;
        ((AutofillManager) c1930k.f16910l).notifyViewEntered(c0533b.f7380c, this.f7377m, new Rect(intValue, intValue2, intValue3, intValue4));
        return o.f6046a;
    }
}
