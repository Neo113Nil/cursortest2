package g0;

import C0.t;
import a.AbstractC0009a;
import android.database.Cursor;
import android.util.Log;
import h0.C0065a;
import h0.C0066b;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p.AbstractC0819i;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y.e f1104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0.p f1105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f1106d;

    public /* synthetic */ k(Y.e eVar, C0.p pVar, e eVar2, int i2) {
        this.f1103a = i2;
        this.f1104b = eVar;
        this.f1105c = pVar;
        this.f1106d = eVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c2;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 1;
        final int i5 = 0;
        C0.p pVar = this.f1105c;
        Y.e eVar = this.f1104b;
        final e eVar2 = this.f1106d;
        switch (this.f1103a) {
            case 0:
                HashMap hashMap = o.f1122c;
                final C0066b c0066b = new C0066b(eVar, pVar);
                eVar2.l(c0066b, new Runnable() { // from class: g0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                e eVar3 = eVar2;
                                C0066b c0066b2 = c0066b;
                                Y.e eVar4 = c0066b2.f1216k;
                                Integer num = (Integer) eVar4.n("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(eVar4.n("cancel"));
                                if (AbstractC0061a.b(eVar3.f1079d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar3.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap2 = eVar3.f1082g;
                                j jVar = null;
                                if (equals) {
                                    j jVar2 = (j) hashMap2.get(num);
                                    if (jVar2 != null) {
                                        eVar3.b(jVar2);
                                    }
                                    c0066b2.c(null);
                                    return;
                                }
                                j jVar3 = (j) hashMap2.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f1102c;
                                        HashMap c3 = e.c(cursor, Integer.valueOf(jVar3.f1101b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c3.put("cursorId", num);
                                        }
                                        c0066b2.c(c3);
                                        if (z2) {
                                            return;
                                        }
                                        eVar3.b(jVar3);
                                        return;
                                    } catch (Exception e2) {
                                        eVar3.i(e2, c0066b2);
                                        if (jVar3 != null) {
                                            eVar3.b(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        eVar3.b(jVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && jVar3 != null) {
                                        eVar3.b(jVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                eVar2.e(c0066b);
                                return;
                            case 2:
                                eVar2.f(c0066b);
                                return;
                            case 3:
                                eVar2.d(c0066b);
                                return;
                            default:
                                e eVar5 = eVar2;
                                AbstractC0009a abstractC0009a = c0066b;
                                Object l2 = abstractC0009a.l("inTransaction");
                                Boolean bool = l2 instanceof Boolean ? (Boolean) l2 : null;
                                boolean z3 = Boolean.TRUE.equals(bool) && abstractC0009a.q() && ((Integer) abstractC0009a.l("transactionId")) == null;
                                if (z3) {
                                    int i6 = eVar5.f1086k + 1;
                                    eVar5.f1086k = i6;
                                    eVar5.f1087l = Integer.valueOf(i6);
                                }
                                if (!eVar5.g(abstractC0009a)) {
                                    if (z3) {
                                        eVar5.f1087l = null;
                                        return;
                                    }
                                    return;
                                } else if (z3) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", eVar5.f1087l);
                                    abstractC0009a.c(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar5.f1087l = null;
                                    }
                                    abstractC0009a.c(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                HashMap hashMap2 = o.f1122c;
                final C0066b c0066b2 = new C0066b(eVar, pVar);
                eVar2.l(c0066b2, new Runnable() { // from class: g0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                e eVar3 = eVar2;
                                C0066b c0066b22 = c0066b2;
                                Y.e eVar4 = c0066b22.f1216k;
                                Integer num = (Integer) eVar4.n("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(eVar4.n("cancel"));
                                if (AbstractC0061a.b(eVar3.f1079d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar3.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = eVar3.f1082g;
                                j jVar = null;
                                if (equals) {
                                    j jVar2 = (j) hashMap22.get(num);
                                    if (jVar2 != null) {
                                        eVar3.b(jVar2);
                                    }
                                    c0066b22.c(null);
                                    return;
                                }
                                j jVar3 = (j) hashMap22.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f1102c;
                                        HashMap c3 = e.c(cursor, Integer.valueOf(jVar3.f1101b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c3.put("cursorId", num);
                                        }
                                        c0066b22.c(c3);
                                        if (z2) {
                                            return;
                                        }
                                        eVar3.b(jVar3);
                                        return;
                                    } catch (Exception e2) {
                                        eVar3.i(e2, c0066b22);
                                        if (jVar3 != null) {
                                            eVar3.b(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        eVar3.b(jVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && jVar3 != null) {
                                        eVar3.b(jVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                eVar2.e(c0066b2);
                                return;
                            case 2:
                                eVar2.f(c0066b2);
                                return;
                            case 3:
                                eVar2.d(c0066b2);
                                return;
                            default:
                                e eVar5 = eVar2;
                                AbstractC0009a abstractC0009a = c0066b2;
                                Object l2 = abstractC0009a.l("inTransaction");
                                Boolean bool = l2 instanceof Boolean ? (Boolean) l2 : null;
                                boolean z3 = Boolean.TRUE.equals(bool) && abstractC0009a.q() && ((Integer) abstractC0009a.l("transactionId")) == null;
                                if (z3) {
                                    int i6 = eVar5.f1086k + 1;
                                    eVar5.f1086k = i6;
                                    eVar5.f1087l = Integer.valueOf(i6);
                                }
                                if (!eVar5.g(abstractC0009a)) {
                                    if (z3) {
                                        eVar5.f1087l = null;
                                        return;
                                    }
                                    return;
                                } else if (z3) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", eVar5.f1087l);
                                    abstractC0009a.c(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar5.f1087l = null;
                                    }
                                    abstractC0009a.c(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 2:
                HashMap hashMap3 = o.f1122c;
                final C0066b c0066b3 = new C0066b(eVar, pVar);
                eVar2.l(c0066b3, new Runnable() { // from class: g0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                e eVar3 = eVar2;
                                C0066b c0066b22 = c0066b3;
                                Y.e eVar4 = c0066b22.f1216k;
                                Integer num = (Integer) eVar4.n("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(eVar4.n("cancel"));
                                if (AbstractC0061a.b(eVar3.f1079d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar3.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = eVar3.f1082g;
                                j jVar = null;
                                if (equals) {
                                    j jVar2 = (j) hashMap22.get(num);
                                    if (jVar2 != null) {
                                        eVar3.b(jVar2);
                                    }
                                    c0066b22.c(null);
                                    return;
                                }
                                j jVar3 = (j) hashMap22.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f1102c;
                                        HashMap c3 = e.c(cursor, Integer.valueOf(jVar3.f1101b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c3.put("cursorId", num);
                                        }
                                        c0066b22.c(c3);
                                        if (z2) {
                                            return;
                                        }
                                        eVar3.b(jVar3);
                                        return;
                                    } catch (Exception e2) {
                                        eVar3.i(e2, c0066b22);
                                        if (jVar3 != null) {
                                            eVar3.b(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        eVar3.b(jVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && jVar3 != null) {
                                        eVar3.b(jVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                eVar2.e(c0066b3);
                                return;
                            case 2:
                                eVar2.f(c0066b3);
                                return;
                            case 3:
                                eVar2.d(c0066b3);
                                return;
                            default:
                                e eVar5 = eVar2;
                                AbstractC0009a abstractC0009a = c0066b3;
                                Object l2 = abstractC0009a.l("inTransaction");
                                Boolean bool = l2 instanceof Boolean ? (Boolean) l2 : null;
                                boolean z3 = Boolean.TRUE.equals(bool) && abstractC0009a.q() && ((Integer) abstractC0009a.l("transactionId")) == null;
                                if (z3) {
                                    int i6 = eVar5.f1086k + 1;
                                    eVar5.f1086k = i6;
                                    eVar5.f1087l = Integer.valueOf(i6);
                                }
                                if (!eVar5.g(abstractC0009a)) {
                                    if (z3) {
                                        eVar5.f1087l = null;
                                        return;
                                    }
                                    return;
                                } else if (z3) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", eVar5.f1087l);
                                    abstractC0009a.c(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar5.f1087l = null;
                                    }
                                    abstractC0009a.c(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 3:
                HashMap hashMap4 = o.f1122c;
                try {
                    eVar2.f1084i.setLocale(Locale.forLanguageTag((String) eVar.n(CommonUrlParts.LOCALE)));
                    pVar.c(null);
                    break;
                } catch (Exception e2) {
                    pVar.a("sqlite_error", "Error calling setLocale: " + e2.getMessage(), null);
                    return;
                }
            case 4:
                HashMap hashMap5 = o.f1122c;
                final C0066b c0066b4 = new C0066b(eVar, pVar);
                final int i6 = 4;
                eVar2.l(c0066b4, new Runnable() { // from class: g0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                e eVar3 = eVar2;
                                C0066b c0066b22 = c0066b4;
                                Y.e eVar4 = c0066b22.f1216k;
                                Integer num = (Integer) eVar4.n("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(eVar4.n("cancel"));
                                if (AbstractC0061a.b(eVar3.f1079d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar3.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = eVar3.f1082g;
                                j jVar = null;
                                if (equals) {
                                    j jVar2 = (j) hashMap22.get(num);
                                    if (jVar2 != null) {
                                        eVar3.b(jVar2);
                                    }
                                    c0066b22.c(null);
                                    return;
                                }
                                j jVar3 = (j) hashMap22.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f1102c;
                                        HashMap c3 = e.c(cursor, Integer.valueOf(jVar3.f1101b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c3.put("cursorId", num);
                                        }
                                        c0066b22.c(c3);
                                        if (z2) {
                                            return;
                                        }
                                        eVar3.b(jVar3);
                                        return;
                                    } catch (Exception e22) {
                                        eVar3.i(e22, c0066b22);
                                        if (jVar3 != null) {
                                            eVar3.b(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        eVar3.b(jVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && jVar3 != null) {
                                        eVar3.b(jVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                eVar2.e(c0066b4);
                                return;
                            case 2:
                                eVar2.f(c0066b4);
                                return;
                            case 3:
                                eVar2.d(c0066b4);
                                return;
                            default:
                                e eVar5 = eVar2;
                                AbstractC0009a abstractC0009a = c0066b4;
                                Object l2 = abstractC0009a.l("inTransaction");
                                Boolean bool = l2 instanceof Boolean ? (Boolean) l2 : null;
                                boolean z3 = Boolean.TRUE.equals(bool) && abstractC0009a.q() && ((Integer) abstractC0009a.l("transactionId")) == null;
                                if (z3) {
                                    int i62 = eVar5.f1086k + 1;
                                    eVar5.f1086k = i62;
                                    eVar5.f1087l = Integer.valueOf(i62);
                                }
                                if (!eVar5.g(abstractC0009a)) {
                                    if (z3) {
                                        eVar5.f1087l = null;
                                        return;
                                    }
                                    return;
                                } else if (z3) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", eVar5.f1087l);
                                    abstractC0009a.c(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar5.f1087l = null;
                                    }
                                    abstractC0009a.c(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 5:
                HashMap hashMap6 = o.f1122c;
                final C0066b c0066b5 = new C0066b(eVar, pVar);
                eVar2.l(c0066b5, new Runnable() { // from class: g0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                e eVar3 = eVar2;
                                C0066b c0066b22 = c0066b5;
                                Y.e eVar4 = c0066b22.f1216k;
                                Integer num = (Integer) eVar4.n("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(eVar4.n("cancel"));
                                if (AbstractC0061a.b(eVar3.f1079d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(eVar3.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = eVar3.f1082g;
                                j jVar = null;
                                if (equals) {
                                    j jVar2 = (j) hashMap22.get(num);
                                    if (jVar2 != null) {
                                        eVar3.b(jVar2);
                                    }
                                    c0066b22.c(null);
                                    return;
                                }
                                j jVar3 = (j) hashMap22.get(num);
                                boolean z2 = false;
                                try {
                                    try {
                                        if (jVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = jVar3.f1102c;
                                        HashMap c3 = e.c(cursor, Integer.valueOf(jVar3.f1101b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            c3.put("cursorId", num);
                                        }
                                        c0066b22.c(c3);
                                        if (z2) {
                                            return;
                                        }
                                        eVar3.b(jVar3);
                                        return;
                                    } catch (Exception e22) {
                                        eVar3.i(e22, c0066b22);
                                        if (jVar3 != null) {
                                            eVar3.b(jVar3);
                                        } else {
                                            jVar = jVar3;
                                        }
                                        if (0 != 0 || jVar == null) {
                                            return;
                                        }
                                        eVar3.b(jVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && jVar3 != null) {
                                        eVar3.b(jVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                eVar2.e(c0066b5);
                                return;
                            case 2:
                                eVar2.f(c0066b5);
                                return;
                            case 3:
                                eVar2.d(c0066b5);
                                return;
                            default:
                                e eVar5 = eVar2;
                                AbstractC0009a abstractC0009a = c0066b5;
                                Object l2 = abstractC0009a.l("inTransaction");
                                Boolean bool = l2 instanceof Boolean ? (Boolean) l2 : null;
                                boolean z3 = Boolean.TRUE.equals(bool) && abstractC0009a.q() && ((Integer) abstractC0009a.l("transactionId")) == null;
                                if (z3) {
                                    int i62 = eVar5.f1086k + 1;
                                    eVar5.f1086k = i62;
                                    eVar5.f1087l = Integer.valueOf(i62);
                                }
                                if (!eVar5.g(abstractC0009a)) {
                                    if (z3) {
                                        eVar5.f1087l = null;
                                        return;
                                    }
                                    return;
                                } else if (z3) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", eVar5.f1087l);
                                    abstractC0009a.c(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        eVar5.f1087l = null;
                                    }
                                    abstractC0009a.c(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                HashMap hashMap7 = o.f1122c;
                Boolean bool = Boolean.TRUE;
                boolean equals = bool.equals(eVar.n("noResult"));
                boolean equals2 = bool.equals(eVar.n("continueOnError"));
                List list = (List) eVar.n("operations");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C0065a c0065a = new C0065a((Map) it.next(), equals);
                    String m2 = c0065a.m();
                    m2.getClass();
                    t tVar = c0065a.f1213k;
                    switch (m2.hashCode()) {
                        case -1319569547:
                            if (m2.equals("execute")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1183792455:
                            if (m2.equals("insert")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -838846263:
                            if (m2.equals("update")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 107944136:
                            if (m2.equals("query")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            if (!eVar2.g(c0065a)) {
                                if (!equals2) {
                                    pVar.a((String) tVar.f116a, (String) tVar.f117b, (HashMap) tVar.f119d);
                                    break;
                                } else {
                                    c0065a.L(arrayList);
                                    break;
                                }
                            } else {
                                c0065a.c(null);
                                c0065a.M(arrayList);
                                break;
                            }
                        case 1:
                            if (!eVar2.d(c0065a)) {
                                if (!equals2) {
                                    pVar.a((String) tVar.f116a, (String) tVar.f117b, (HashMap) tVar.f119d);
                                    break;
                                } else {
                                    c0065a.L(arrayList);
                                    break;
                                }
                            } else {
                                c0065a.M(arrayList);
                                break;
                            }
                        case 2:
                            if (!eVar2.f(c0065a)) {
                                if (!equals2) {
                                    pVar.a((String) tVar.f116a, (String) tVar.f117b, (HashMap) tVar.f119d);
                                    break;
                                } else {
                                    c0065a.L(arrayList);
                                    break;
                                }
                            } else {
                                c0065a.M(arrayList);
                                break;
                            }
                        case 3:
                            if (!eVar2.e(c0065a)) {
                                if (!equals2) {
                                    pVar.a((String) tVar.f116a, (String) tVar.f117b, (HashMap) tVar.f119d);
                                    break;
                                } else {
                                    c0065a.L(arrayList);
                                    break;
                                }
                            } else {
                                c0065a.M(arrayList);
                                break;
                            }
                        default:
                            pVar.a("bad_param", AbstractC0819i.a("Batch method '", m2, "' not supported"), null);
                            break;
                    }
                }
                if (!equals) {
                    pVar.c(arrayList);
                    break;
                } else {
                    pVar.c(null);
                    break;
                }
        }
    }

    public /* synthetic */ k(Y.e eVar, e eVar2, C0.p pVar) {
        this.f1103a = 3;
        this.f1104b = eVar;
        this.f1106d = eVar2;
        this.f1105c = pVar;
    }

    public /* synthetic */ k(e eVar, Y.e eVar2, C0.p pVar) {
        this.f1103a = 6;
        this.f1106d = eVar;
        this.f1104b = eVar2;
        this.f1105c = pVar;
    }
}
