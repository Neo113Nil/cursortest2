package PZ;

import M4.c;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.C9011c;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private Integer f22111a;

    public static Bundle a(d dVar) {
        Bundle bundle = new Bundle();
        Integer num = dVar.f22111a;
        bundle.putInt("ru.ozon.compass.SOFT_INPUT_MODE_KEY", num != null ? num.intValue() : -1);
        return bundle;
    }

    public static final void b(d dVar, r rVar) {
        Integer num = dVar.f22111a;
        if (num != null) {
            int intValue = num.intValue();
            Window window = rVar.getWindow();
            if (window != null) {
                window.setSoftInputMode(intValue);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r1 != (-1)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(@NotNull r activity, @NotNull C9011c owner) {
        Integer num;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(owner, "owner");
        AbstractC5434v lifecycle = owner.getLifecycle();
        lifecycle.a(new c(this, activity, lifecycle));
        M4.c savedStateRegistry = owner.getSavedStateRegistry();
        Bundle b11 = savedStateRegistry.b("ru.ozon.compass.BUNDLE_SOFT_INPUT_MODE");
        Integer num2 = null;
        if (b11 != null) {
            int i11 = b11.getInt("ru.ozon.compass.SOFT_INPUT_MODE_KEY");
            num = Integer.valueOf(i11);
        }
        num = null;
        if (num != null) {
            this.f22111a = num;
        } else if (this.f22111a == null) {
            Window window = activity.getWindow();
            if (window != null && (attributes = window.getAttributes()) != null) {
                num2 = Integer.valueOf(attributes.softInputMode);
            }
            this.f22111a = num2;
        }
        savedStateRegistry.i("ru.ozon.compass.BUNDLE_SOFT_INPUT_MODE");
        savedStateRegistry.g("ru.ozon.compass.BUNDLE_SOFT_INPUT_MODE", new c.b() { // from class: PZ.b
            @Override // M4.c.b
            public final Bundle saveState() {
                return d.a(d.this);
            }
        });
    }
}
