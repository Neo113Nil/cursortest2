package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.C0340y;
import androidx.media3.common.C0341z;
import com.facebook.C0688a;
import com.facebook.C0728q;
import com.facebook.login.u;
import com.haryanvi.netstream.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/facebook/login/v;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "a", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class v extends Fragment {
    public String a;
    public u.c b;
    public u c;
    public ActivityResultLauncher<Intent> d;
    public View e;

    public static final class b {
        public b() {
        }
    }

    public final u e() {
        u uVar = this.c;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        e().s(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        u uVar = bundle != null ? (u) bundle.getParcelable("loginClient") : null;
        if (uVar == null) {
            Intrinsics.checkNotNullParameter(this, "fragment");
            uVar = new u();
            uVar.b = -1;
            if (uVar.c != null) {
                throw new C0728q("Can't set fragment once it is already set.");
            }
            uVar.c = this;
        } else {
            if (uVar.c != null) {
                throw new C0728q("Can't set fragment once it is already set.");
            }
            uVar.c = this;
        }
        this.c = uVar;
        e().d = new C0340y(this, 1);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.a = callingActivity.getPackageName();
        }
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.b = (u.c) bundleExtra.getParcelable("request");
        }
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C0341z(new w(this, activity), 1));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…andlerCallback(activity))");
        this.d = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById<View>(…in_fragment_progress_bar)");
        this.e = findViewById;
        e().e = new b();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        z p = e().p();
        if (p != null) {
            p.l();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        View view = getView();
        View findViewById = view != null ? view.findViewById(R.id.com_facebook_login_fragment_progress_bar) : null;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.a == null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        u e = e();
        u.c request = this.b;
        u.c cVar = e.i;
        if ((cVar == null || e.b < 0) && request != null) {
            A a = request.p;
            if (cVar != null) {
                throw new C0728q("Attempted to authorize while a request is pending.");
            }
            C0688a.Companion.getClass();
            if (!C0688a.b.c() || e.l()) {
                e.i = request;
                Intrinsics.checkNotNullParameter(request, "request");
                ArrayList arrayList = new ArrayList();
                t tVar = request.a;
                A a2 = A.INSTAGRAM;
                if (a != a2) {
                    if (tVar.a) {
                        arrayList.add(new p(e));
                    }
                    if (!com.facebook.w.p && tVar.b) {
                        arrayList.add(new s(e));
                    }
                } else if (!com.facebook.w.p && tVar.f) {
                    arrayList.add(new r(e));
                }
                if (tVar.e) {
                    arrayList.add(new C0720b(e));
                }
                if (tVar.c) {
                    arrayList.add(new E(e));
                }
                if (a != a2 && tVar.d) {
                    arrayList.add(new m(e));
                }
                e.a = (z[]) arrayList.toArray(new z[0]);
                e.t();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", e());
    }
}
