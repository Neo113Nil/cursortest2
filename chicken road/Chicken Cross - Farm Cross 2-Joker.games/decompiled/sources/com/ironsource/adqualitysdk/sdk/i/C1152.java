package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.צּ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1152 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3304;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f3305;

    public C1152(ArrayList arrayList, JSONObject jSONObject) {
        this.f3305 = arrayList;
        this.f3304 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        Iterator it = this.f3305.iterator();
        while (it.hasNext()) {
            C1123 c1123 = (C1123) it.next();
            JSONObject jSONObject = this.f3304;
            Context context = c1123.f3255.f3039.f2615;
            String str = AbstractC0739.f2029;
            int i = AbstractC0733.f2005;
            Intent putExtra = new Intent(str).putExtra(AbstractC0739.f2021, jSONObject.toString());
            C0780 m5666 = C0780.m5666(context);
            if (m5666.f2283) {
                synchronized (m5666.f2281) {
                    putExtra.getAction();
                    String resolveTypeIfNeeded = putExtra.resolveTypeIfNeeded(m5666.f2282.getContentResolver());
                    putExtra.getData();
                    String scheme = putExtra.getScheme();
                    putExtra.getCategories();
                    boolean z = (putExtra.getFlags() & 8) != 0;
                    if (z) {
                        Log.v(C0780.f2278, StringFog.decrypt("yTKv7Wq2Dlr8d6j7dqVH\n", "m1fcggbAZzQ=\n") + resolveTypeIfNeeded + StringFog.decrypt("fr3nW4vIZC8=\n", "Xs6EM+6lAQ8=\n") + scheme + StringFog.decrypt("3fX5OvCtx9uT7r8=\n", "/ZqfGpnDs74=\n") + putExtra);
                    }
                    ArrayList arrayList = (ArrayList) m5666.f2280.get(putExtra.getAction());
                    if (arrayList != null) {
                        if (z) {
                            Log.v(C0780.f2278, StringFog.decrypt("BclkF2q0+4Ut2WREJQ==\n", "RKoQfgXa2+k=\n") + arrayList);
                        }
                        if (arrayList.size() > 0) {
                            if (arrayList.get(0) != null) {
                                throw new ClassCastException();
                            }
                            if (!z) {
                                throw null;
                            }
                            StringFog.decrypt("2J+cy66UeYu1n4/Jr5NkmLWYgcSymGXM\n", "lf7oqMb9F+w=\n");
                            throw null;
                        }
                    }
                }
            }
        }
    }
}
