package y0;

import B0.q;
import android.os.Build;
import kotlin.jvm.internal.i;
import x0.C1535a;
import z0.e;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1551a extends AbstractC1552b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12332f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1551a(e eVar, int i2) {
        super(eVar);
        this.f12332f = i2;
    }

    @Override // y0.AbstractC1552b
    public final boolean a(q workSpec) {
        switch (this.f12332f) {
            case 0:
                i.e(workSpec, "workSpec");
                return workSpec.f182j.f11763b;
            case 1:
                i.e(workSpec, "workSpec");
                return workSpec.f182j.f11765d;
            case 2:
                i.e(workSpec, "workSpec");
                return workSpec.f182j.f11762a == 2;
            case 3:
                i.e(workSpec, "workSpec");
                int i2 = workSpec.f182j.f11762a;
                return i2 == 3 || (Build.VERSION.SDK_INT >= 30 && i2 == 6);
            default:
                i.e(workSpec, "workSpec");
                return workSpec.f182j.f11766e;
        }
    }

    @Override // y0.AbstractC1552b
    public final boolean b(Object obj) {
        switch (this.f12332f) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                C1535a value = (C1535a) obj;
                i.e(value, "value");
                int i2 = Build.VERSION.SDK_INT;
                boolean z = value.f12254a;
                if (i2 >= 26) {
                    if (!z || !value.f12255b) {
                        return true;
                    }
                } else if (!z) {
                    return true;
                }
                return false;
            case 3:
                C1535a value2 = (C1535a) obj;
                i.e(value2, "value");
                return !value2.f12254a || value2.f12256c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
