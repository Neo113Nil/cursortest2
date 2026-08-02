package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.preference.c;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private Context f44600a;

    /* renamed from: b, reason: collision with root package name */
    private long f44601b = 0;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f44602c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences.Editor f44603d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44604e;

    /* renamed from: f, reason: collision with root package name */
    private String f44605f;

    /* renamed from: g, reason: collision with root package name */
    private PreferenceScreen f44606g;

    /* renamed from: h, reason: collision with root package name */
    private c f44607h;

    /* renamed from: i, reason: collision with root package name */
    private c f44608i;

    /* renamed from: j, reason: collision with root package name */
    private c f44609j;

    public interface a {
    }

    public interface b {
    }

    public g(Context context) {
        this.f44600a = context;
        n(context.getPackageName() + "_preferences");
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    public final Preference a(@NonNull String str) {
        PreferenceScreen preferenceScreen = this.f44606g;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.l0(str);
    }

    final SharedPreferences.Editor c() {
        if (!this.f44604e) {
            return h().edit();
        }
        if (this.f44603d == null) {
            this.f44603d = h().edit();
        }
        return this.f44603d;
    }

    final long d() {
        long j11;
        synchronized (this) {
            j11 = this.f44601b;
            this.f44601b = 1 + j11;
        }
        return j11;
    }

    public final a e() {
        return this.f44609j;
    }

    public final b f() {
        return this.f44607h;
    }

    public final PreferenceScreen g() {
        return this.f44606g;
    }

    public final SharedPreferences h() {
        if (this.f44602c == null) {
            this.f44602c = this.f44600a.getSharedPreferences(this.f44605f, 0);
        }
        return this.f44602c;
    }

    public final PreferenceScreen i(Context context) {
        this.f44604e = true;
        PreferenceScreen preferenceScreen = (PreferenceScreen) new f(context, this).c();
        preferenceScreen.G(this);
        SharedPreferences.Editor editor = this.f44603d;
        if (editor != null) {
            editor.apply();
        }
        this.f44604e = false;
        return preferenceScreen;
    }

    public final void j(c cVar) {
        this.f44608i = cVar;
    }

    public final void k(c cVar) {
        this.f44609j = cVar;
    }

    public final void l(c cVar) {
        this.f44607h = cVar;
    }

    public final boolean m(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f44606g;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.K();
        }
        this.f44606g = preferenceScreen;
        return true;
    }

    public final void n(String str) {
        this.f44605f = str;
        this.f44602c = null;
    }

    final boolean o() {
        return !this.f44604e;
    }

    public final void p(DialogPreference dialogPreference) {
        DialogInterfaceOnCancelListenerC5390k cVar;
        c cVar2 = this.f44608i;
        if (cVar2 != null) {
            if (!(cVar2.getActivity() instanceof c.d ? ((c.d) cVar2.getActivity()).a() : false) && cVar2.getFragmentManager().g0("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (dialogPreference instanceof EditTextPreference) {
                    String j11 = dialogPreference.j();
                    cVar = new G4.a();
                    Bundle bundle = new Bundle(1);
                    bundle.putString("key", j11);
                    cVar.setArguments(bundle);
                } else if (dialogPreference instanceof ListPreference) {
                    String j12 = dialogPreference.j();
                    cVar = new G4.b();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("key", j12);
                    cVar.setArguments(bundle2);
                } else {
                    if (!(dialogPreference instanceof MultiSelectListPreference)) {
                        throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + dialogPreference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                    }
                    String j13 = dialogPreference.j();
                    cVar = new G4.c();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString("key", j13);
                    cVar.setArguments(bundle3);
                }
                cVar.setTargetFragment(cVar2, 0);
                cVar.show(cVar2.getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
            }
        }
    }
}
