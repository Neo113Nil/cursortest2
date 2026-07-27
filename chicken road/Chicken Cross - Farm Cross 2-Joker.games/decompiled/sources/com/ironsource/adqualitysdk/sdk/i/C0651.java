package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܚ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0651 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap f1790 = new HashMap();

    public C0651() {
        new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        r4 = r3.f1790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r4 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if (r4.isEmpty() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        r4 = r4.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        if (r4.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        r1 = (java.lang.String) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0.contains(r1) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        r1 = m5609(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0078, code lost:
    
        if (r1.f1821 != com.ironsource.adqualitysdk.sdk.i.EnumC0670.f1833) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007a, code lost:
    
        r4 = true;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean m5610(boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (z) {
            Iterator it = AbstractC0978.f2893.iterator();
            while (it.hasNext()) {
                arrayList.add(((String) it.next()).toLowerCase());
            }
        } else {
            arrayList.add(AbstractC0978.f2894.toLowerCase());
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0667 m5609 = m5609((String) it2.next());
            if (m5609 == null || m5609.f1821 != EnumC0670.f1833) {
                break;
            }
        }
        z2 = false;
        return z2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0667 m5609(String str) {
        HashMap hashMap = this.f1790;
        if (hashMap != null) {
            return (C0667) hashMap.get(str);
        }
        return null;
    }
}
