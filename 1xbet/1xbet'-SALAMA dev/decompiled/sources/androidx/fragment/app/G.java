package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.InterfaceC0724t;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class G implements p037f.a, androidx.lifecycle.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9355b;

    public /* synthetic */ G(Object obj, int i7) {
        this.f9354a = i7;
        this.f9355b = obj;
    }

    @Override // p037f.a
    public void a(Object obj) {
        switch (this.f9354a) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
                }
                Q q7 = (Q) this.f9355b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) q7.f9372E.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    p072k1.g gVar = q7.f9385c;
                    String str = fragmentManager$LaunchedFragmentInfo.f9330a;
                    if (gVar.s(str) == null) {
                        p155w1.L.l("Permission request result delivered for unknown Fragment ", str, "FragmentManager");
                    }
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                Q q8 = (Q) this.f9355b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) q8.f9372E.pollLast();
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    p072k1.g gVar2 = q8.f9385c;
                    String str2 = fragmentManager$LaunchedFragmentInfo2.f9330a;
                    AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701vS = gVar2.s(str2);
                    if (abstractComponentCallbacksC0701vS == null) {
                        p155w1.L.l("Activity result delivered for unknown Fragment ", str2, "FragmentManager");
                    } else {
                        abstractComponentCallbacksC0701vS.p(fragmentManager$LaunchedFragmentInfo2.f9331b, activityResult.f8119a, activityResult.f8120b);
                    }
                }
                break;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                Q q9 = (Q) this.f9355b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) q9.f9372E.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    p072k1.g gVar3 = q9.f9385c;
                    String str3 = fragmentManager$LaunchedFragmentInfo3.f9330a;
                    AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701vS2 = gVar3.s(str3);
                    if (abstractComponentCallbacksC0701vS2 == null) {
                        p155w1.L.l("Intent Sender result delivered for unknown Fragment ", str3, "FragmentManager");
                    } else {
                        abstractComponentCallbacksC0701vS2.p(fragmentManager$LaunchedFragmentInfo3.f9331b, activityResult2.f8119a, activityResult2.f8120b);
                    }
                }
                break;
        }
    }

    @Override // androidx.lifecycle.C
    public void b(Object obj) {
        if (((InterfaceC0724t) obj) != null) {
            DialogInterfaceOnCancelListenerC0697q dialogInterfaceOnCancelListenerC0697q = (DialogInterfaceOnCancelListenerC0697q) this.f9355b;
            if (dialogInterfaceOnCancelListenerC0697q.f9482o0) {
                dialogInterfaceOnCancelListenerC0697q.getClass();
                throw new IllegalStateException("Fragment " + dialogInterfaceOnCancelListenerC0697q + " did not return a View from onCreateView() or this was called before onCreateView().");
            }
        }
    }
}
