package androidx.fragment.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p045g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9364a;

    public /* synthetic */ M(int i7) {
        this.f9364a = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p045g.a
    public final Intent a(A a2, Parcelable parcelable) {
        Bundle bundleExtra;
        switch (this.f9364a) {
            case 0:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) parcelable;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = intentSenderRequest.f8122b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = intentSenderRequest.f8121a;
                        t6.h.e(intentSender, "intentSender");
                        intentSenderRequest = new IntentSenderRequest(intentSender, null, intentSenderRequest.f8123c, intentSenderRequest.f8124d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) parcelable;
                t6.h.e(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                t6.h.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intentPutExtra;
            default:
                Intent intent3 = (Intent) parcelable;
                t6.h.e(intent3, "input");
                return intent3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p045g.a
    public E1.b b(A a2, Parcelable parcelable) {
        switch (this.f9364a) {
            case 1:
                String[] strArr = (String[]) parcelable;
                t6.h.e(strArr, "input");
                if (strArr.length == 0) {
                    return new E1.b(p050g6.q.f13309a);
                }
                for (String str : strArr) {
                    if (G.h.checkSelfPermission(a2, str) != 0) {
                        return null;
                    }
                }
                int iK0 = p050g6.s.K0(strArr.length);
                if (iK0 < 16) {
                    iK0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iK0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new E1.b(linkedHashMap);
            default:
                return super.b(a2, parcelable);
        }
    }

    @Override // p045g.a
    public final Object c(Intent intent, int i7) {
        switch (this.f9364a) {
            case 0:
                return new ActivityResult(intent, i7);
            case 1:
                p050g6.q qVar = p050g6.q.f13309a;
                if (i7 != -1 || intent == null) {
                    return qVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return qVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i8 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i8 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(p050g6.j.N0(arrayList2), p050g6.j.N0(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new p044f6.d(it.next(), it2.next()));
                }
                return p050g6.s.P0(arrayList3);
            default:
                return new ActivityResult(intent, i7);
        }
    }
}
