package S0;

import android.os.Build;

/* renamed from: S0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0431b extends AbstractC0432c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0431b(int i7, String str, String str2) {
        super(str, str2);
        this.f6235d = i7;
    }

    @Override // S0.AbstractC0432c
    public final boolean a() {
        switch (this.f6235d) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return Build.VERSION.SDK_INT >= 26;
            case 4:
                return Build.VERSION.SDK_INT >= 27;
            case 5:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }
}
