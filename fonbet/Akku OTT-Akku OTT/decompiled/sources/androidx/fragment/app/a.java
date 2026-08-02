package androidx.fragment.app;

import androidx.fragment.app.SpecialEffectsController;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                DefaultSpecialEffectsController.collectEffects$lambda$2((DefaultSpecialEffectsController) this.b, (SpecialEffectsController.Operation) this.c);
                break;
            default:
                ((CrashlyticsCore) this.b).lambda$doBackgroundInitializationAsync$0((SettingsProvider) this.c);
                break;
        }
    }
}
