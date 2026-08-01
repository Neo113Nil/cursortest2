package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺮ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1236 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List f3516;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final int f3517;

    public C1236(C1245 c1245) {
        this.f3517 = c1245.f3534;
        Collections.unmodifiableList(new ArrayList(c1245.f3533));
        Collections.unmodifiableList(new ArrayList(c1245.f3532));
        Collections.unmodifiableMap(new HashMap(c1245.f3531));
        this.f3516 = Collections.unmodifiableList(new ArrayList(c1245.f3530));
        Collections.unmodifiableList(new ArrayList(c1245.f3529));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5937() {
        String sb;
        List<Integer> list = this.f3516;
        if (list.isEmpty()) {
            sb = StringFog.decrypt("xuthtQ==\n", "qIQP0A1akoM=\n");
        } else {
            TreeSet treeSet = new TreeSet();
            for (Integer num : list) {
                if (num != null) {
                    treeSet.add(num);
                }
            }
            if (treeSet.isEmpty()) {
                sb = StringFog.decrypt("LsrXQg==\n", "QKW5JyiZeLs=\n");
            } else {
                StringBuilder sb2 = new StringBuilder();
                Iterator it = treeSet.iterator();
                boolean z = true;
                while (it.hasNext()) {
                    Integer num2 = (Integer) it.next();
                    if (!z) {
                        sb2.append(AbstractJsonLexerKt.COMMA);
                    }
                    sb2.append(num2);
                    z = false;
                }
                sb = sb2.toString();
            }
        }
        return AbstractC0548.m5514("Bsi9fuzs1HEH\n", "PbvUGYKNuAI=\n", new StringBuilder().append(StringFog.decrypt("KEgDTWeeRSJk\n", "Xno4PgTxN0c=\n")).append(this.f3517).append(StringFog.decrypt("Yw==\n", "TGZOPPHvGnY=\n")).append(13), sb);
    }
}
