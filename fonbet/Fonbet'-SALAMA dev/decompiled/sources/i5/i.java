package i5;

import A5.o;
import A5.p;
import W5.AbstractC0486a1;
import android.database.Cursor;
import android.util.Log;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import w1.F0;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f14039c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1282d f14040d;

    public /* synthetic */ i(o oVar, p pVar, C1282d c1282d, int i7) {
        this.f14037a = i7;
        this.f14038b = oVar;
        this.f14039c = pVar;
        this.f14040d = c1282d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c3;
        final int i7 = 3;
        final int i8 = 2;
        final int i9 = 1;
        final int i10 = 0;
        o oVar = this.f14038b;
        p pVar = this.f14039c;
        final C1282d c1282d = this.f14040d;
        switch (this.f14037a) {
            case 0:
                HashMap hashMap = k.f14052c;
                final j5.b bVar = new j5.b(oVar, pVar);
                c1282d.l(bVar, new Runnable() { // from class: i5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                C1282d c1282d2 = c1282d;
                                j5.b bVar2 = bVar;
                                o oVar2 = bVar2.f14640e;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (AbstractC1279a.b(c1282d2.f14017d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1282d2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap2 = c1282d2.f14020g;
                                h hVar = null;
                                if (equals) {
                                    h hVar2 = (h) hashMap2.get(num);
                                    if (hVar2 != null) {
                                        c1282d2.b(hVar2);
                                    }
                                    bVar2.f(null);
                                    return;
                                }
                                h hVar3 = (h) hashMap2.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (hVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = hVar3.f14036c;
                                        HashMap c4 = C1282d.c(cursor, Integer.valueOf(hVar3.f14035b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            c4.put("cursorId", num);
                                        }
                                        bVar2.f(c4);
                                        if (z4) {
                                            return;
                                        }
                                        c1282d2.b(hVar3);
                                        return;
                                    } catch (Exception e7) {
                                        c1282d2.i(e7, bVar2);
                                        if (hVar3 != null) {
                                            c1282d2.b(hVar3);
                                        } else {
                                            hVar = hVar3;
                                        }
                                        if (0 != 0 || hVar == null) {
                                            return;
                                        }
                                        c1282d2.b(hVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && hVar3 != null) {
                                        c1282d2.b(hVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1282d.e(bVar);
                                return;
                            case 2:
                                c1282d.f(bVar);
                                return;
                            case 3:
                                c1282d.d(bVar);
                                return;
                            default:
                                C1282d c1282d3 = c1282d;
                                p3.f fVar = bVar;
                                Object I7 = fVar.I("inTransaction");
                                Boolean bool = I7 instanceof Boolean ? (Boolean) I7 : null;
                                boolean z7 = Boolean.TRUE.equals(bool) && fVar.Q() && ((Integer) fVar.I("transactionId")) == null;
                                if (z7) {
                                    int i11 = c1282d3.f14023k + 1;
                                    c1282d3.f14023k = i11;
                                    c1282d3.f14024l = Integer.valueOf(i11);
                                }
                                if (!c1282d3.g(fVar)) {
                                    if (z7) {
                                        c1282d3.f14024l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", c1282d3.f14024l);
                                    fVar.f(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1282d3.f14024l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                HashMap hashMap2 = k.f14052c;
                final j5.b bVar2 = new j5.b(oVar, pVar);
                c1282d.l(bVar2, new Runnable() { // from class: i5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                C1282d c1282d2 = c1282d;
                                j5.b bVar22 = bVar2;
                                o oVar2 = bVar22.f14640e;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (AbstractC1279a.b(c1282d2.f14017d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1282d2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c1282d2.f14020g;
                                h hVar = null;
                                if (equals) {
                                    h hVar2 = (h) hashMap22.get(num);
                                    if (hVar2 != null) {
                                        c1282d2.b(hVar2);
                                    }
                                    bVar22.f(null);
                                    return;
                                }
                                h hVar3 = (h) hashMap22.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (hVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = hVar3.f14036c;
                                        HashMap c4 = C1282d.c(cursor, Integer.valueOf(hVar3.f14035b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            c4.put("cursorId", num);
                                        }
                                        bVar22.f(c4);
                                        if (z4) {
                                            return;
                                        }
                                        c1282d2.b(hVar3);
                                        return;
                                    } catch (Exception e7) {
                                        c1282d2.i(e7, bVar22);
                                        if (hVar3 != null) {
                                            c1282d2.b(hVar3);
                                        } else {
                                            hVar = hVar3;
                                        }
                                        if (0 != 0 || hVar == null) {
                                            return;
                                        }
                                        c1282d2.b(hVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && hVar3 != null) {
                                        c1282d2.b(hVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1282d.e(bVar2);
                                return;
                            case 2:
                                c1282d.f(bVar2);
                                return;
                            case 3:
                                c1282d.d(bVar2);
                                return;
                            default:
                                C1282d c1282d3 = c1282d;
                                p3.f fVar = bVar2;
                                Object I7 = fVar.I("inTransaction");
                                Boolean bool = I7 instanceof Boolean ? (Boolean) I7 : null;
                                boolean z7 = Boolean.TRUE.equals(bool) && fVar.Q() && ((Integer) fVar.I("transactionId")) == null;
                                if (z7) {
                                    int i11 = c1282d3.f14023k + 1;
                                    c1282d3.f14023k = i11;
                                    c1282d3.f14024l = Integer.valueOf(i11);
                                }
                                if (!c1282d3.g(fVar)) {
                                    if (z7) {
                                        c1282d3.f14024l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap hashMap3 = new HashMap();
                                    hashMap3.put("transactionId", c1282d3.f14024l);
                                    fVar.f(hashMap3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1282d3.f14024l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 2:
                HashMap hashMap3 = k.f14052c;
                final j5.b bVar3 = new j5.b(oVar, pVar);
                c1282d.l(bVar3, new Runnable() { // from class: i5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                C1282d c1282d2 = c1282d;
                                j5.b bVar22 = bVar3;
                                o oVar2 = bVar22.f14640e;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (AbstractC1279a.b(c1282d2.f14017d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1282d2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c1282d2.f14020g;
                                h hVar = null;
                                if (equals) {
                                    h hVar2 = (h) hashMap22.get(num);
                                    if (hVar2 != null) {
                                        c1282d2.b(hVar2);
                                    }
                                    bVar22.f(null);
                                    return;
                                }
                                h hVar3 = (h) hashMap22.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (hVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = hVar3.f14036c;
                                        HashMap c4 = C1282d.c(cursor, Integer.valueOf(hVar3.f14035b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            c4.put("cursorId", num);
                                        }
                                        bVar22.f(c4);
                                        if (z4) {
                                            return;
                                        }
                                        c1282d2.b(hVar3);
                                        return;
                                    } catch (Exception e7) {
                                        c1282d2.i(e7, bVar22);
                                        if (hVar3 != null) {
                                            c1282d2.b(hVar3);
                                        } else {
                                            hVar = hVar3;
                                        }
                                        if (0 != 0 || hVar == null) {
                                            return;
                                        }
                                        c1282d2.b(hVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && hVar3 != null) {
                                        c1282d2.b(hVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1282d.e(bVar3);
                                return;
                            case 2:
                                c1282d.f(bVar3);
                                return;
                            case 3:
                                c1282d.d(bVar3);
                                return;
                            default:
                                C1282d c1282d3 = c1282d;
                                p3.f fVar = bVar3;
                                Object I7 = fVar.I("inTransaction");
                                Boolean bool = I7 instanceof Boolean ? (Boolean) I7 : null;
                                boolean z7 = Boolean.TRUE.equals(bool) && fVar.Q() && ((Integer) fVar.I("transactionId")) == null;
                                if (z7) {
                                    int i11 = c1282d3.f14023k + 1;
                                    c1282d3.f14023k = i11;
                                    c1282d3.f14024l = Integer.valueOf(i11);
                                }
                                if (!c1282d3.g(fVar)) {
                                    if (z7) {
                                        c1282d3.f14024l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c1282d3.f14024l);
                                    fVar.f(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1282d3.f14024l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 3:
                HashMap hashMap4 = k.f14052c;
                try {
                    c1282d.f14022i.setLocale(Locale.forLanguageTag((String) oVar.a(Device.JsonKeys.LOCALE)));
                    pVar.success(null);
                    break;
                } catch (Exception e7) {
                    pVar.error("sqlite_error", "Error calling setLocale: " + e7.getMessage(), null);
                    return;
                }
            case 4:
                HashMap hashMap5 = k.f14052c;
                final j5.b bVar4 = new j5.b(oVar, pVar);
                final int i11 = 4;
                c1282d.l(bVar4, new Runnable() { // from class: i5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                C1282d c1282d2 = c1282d;
                                j5.b bVar22 = bVar4;
                                o oVar2 = bVar22.f14640e;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (AbstractC1279a.b(c1282d2.f14017d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1282d2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c1282d2.f14020g;
                                h hVar = null;
                                if (equals) {
                                    h hVar2 = (h) hashMap22.get(num);
                                    if (hVar2 != null) {
                                        c1282d2.b(hVar2);
                                    }
                                    bVar22.f(null);
                                    return;
                                }
                                h hVar3 = (h) hashMap22.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (hVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = hVar3.f14036c;
                                        HashMap c4 = C1282d.c(cursor, Integer.valueOf(hVar3.f14035b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            c4.put("cursorId", num);
                                        }
                                        bVar22.f(c4);
                                        if (z4) {
                                            return;
                                        }
                                        c1282d2.b(hVar3);
                                        return;
                                    } catch (Exception e72) {
                                        c1282d2.i(e72, bVar22);
                                        if (hVar3 != null) {
                                            c1282d2.b(hVar3);
                                        } else {
                                            hVar = hVar3;
                                        }
                                        if (0 != 0 || hVar == null) {
                                            return;
                                        }
                                        c1282d2.b(hVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && hVar3 != null) {
                                        c1282d2.b(hVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1282d.e(bVar4);
                                return;
                            case 2:
                                c1282d.f(bVar4);
                                return;
                            case 3:
                                c1282d.d(bVar4);
                                return;
                            default:
                                C1282d c1282d3 = c1282d;
                                p3.f fVar = bVar4;
                                Object I7 = fVar.I("inTransaction");
                                Boolean bool = I7 instanceof Boolean ? (Boolean) I7 : null;
                                boolean z7 = Boolean.TRUE.equals(bool) && fVar.Q() && ((Integer) fVar.I("transactionId")) == null;
                                if (z7) {
                                    int i112 = c1282d3.f14023k + 1;
                                    c1282d3.f14023k = i112;
                                    c1282d3.f14024l = Integer.valueOf(i112);
                                }
                                if (!c1282d3.g(fVar)) {
                                    if (z7) {
                                        c1282d3.f14024l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c1282d3.f14024l);
                                    fVar.f(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1282d3.f14024l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 5:
                HashMap hashMap6 = k.f14052c;
                final j5.b bVar5 = new j5.b(oVar, pVar);
                c1282d.l(bVar5, new Runnable() { // from class: i5.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i8) {
                            case 0:
                                C1282d c1282d2 = c1282d;
                                j5.b bVar22 = bVar5;
                                o oVar2 = bVar22.f14640e;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int intValue = num.intValue();
                                boolean equals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (AbstractC1279a.b(c1282d2.f14017d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(c1282d2.h());
                                    sb.append("cursor ");
                                    sb.append(intValue);
                                    sb.append(equals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap hashMap22 = c1282d2.f14020g;
                                h hVar = null;
                                if (equals) {
                                    h hVar2 = (h) hashMap22.get(num);
                                    if (hVar2 != null) {
                                        c1282d2.b(hVar2);
                                    }
                                    bVar22.f(null);
                                    return;
                                }
                                h hVar3 = (h) hashMap22.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (hVar3 == null) {
                                            throw new IllegalStateException("Cursor " + intValue + " not found");
                                        }
                                        Cursor cursor = hVar3.f14036c;
                                        HashMap c4 = C1282d.c(cursor, Integer.valueOf(hVar3.f14035b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            c4.put("cursorId", num);
                                        }
                                        bVar22.f(c4);
                                        if (z4) {
                                            return;
                                        }
                                        c1282d2.b(hVar3);
                                        return;
                                    } catch (Exception e72) {
                                        c1282d2.i(e72, bVar22);
                                        if (hVar3 != null) {
                                            c1282d2.b(hVar3);
                                        } else {
                                            hVar = hVar3;
                                        }
                                        if (0 != 0 || hVar == null) {
                                            return;
                                        }
                                        c1282d2.b(hVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && hVar3 != null) {
                                        c1282d2.b(hVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                c1282d.e(bVar5);
                                return;
                            case 2:
                                c1282d.f(bVar5);
                                return;
                            case 3:
                                c1282d.d(bVar5);
                                return;
                            default:
                                C1282d c1282d3 = c1282d;
                                p3.f fVar = bVar5;
                                Object I7 = fVar.I("inTransaction");
                                Boolean bool = I7 instanceof Boolean ? (Boolean) I7 : null;
                                boolean z7 = Boolean.TRUE.equals(bool) && fVar.Q() && ((Integer) fVar.I("transactionId")) == null;
                                if (z7) {
                                    int i112 = c1282d3.f14023k + 1;
                                    c1282d3.f14023k = i112;
                                    c1282d3.f14024l = Integer.valueOf(i112);
                                }
                                if (!c1282d3.g(fVar)) {
                                    if (z7) {
                                        c1282d3.f14024l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap hashMap32 = new HashMap();
                                    hashMap32.put("transactionId", c1282d3.f14024l);
                                    fVar.f(hashMap32);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        c1282d3.f14024l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                HashMap hashMap7 = k.f14052c;
                boolean equals = Boolean.TRUE.equals(oVar.a("noResult"));
                boolean equals2 = Boolean.TRUE.equals(oVar.a("continueOnError"));
                List list = (List) oVar.a("operations");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    j5.a aVar = new j5.a((Map) it.next(), equals);
                    String K7 = aVar.K();
                    K7.getClass();
                    F0 f02 = aVar.f14637e;
                    switch (K7.hashCode()) {
                        case -1319569547:
                            if (K7.equals("execute")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -1183792455:
                            if (K7.equals("insert")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -838846263:
                            if (K7.equals("update")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 107944136:
                            if (K7.equals("query")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            if (!c1282d.g(aVar)) {
                                if (!equals2) {
                                    pVar.error((String) f02.f17375d, (String) f02.f17376e, (HashMap) f02.f17374c);
                                    break;
                                } else {
                                    aVar.m0(arrayList);
                                    break;
                                }
                            } else {
                                aVar.f(null);
                                aVar.n0(arrayList);
                                break;
                            }
                        case 1:
                            if (!c1282d.d(aVar)) {
                                if (!equals2) {
                                    pVar.error((String) f02.f17375d, (String) f02.f17376e, (HashMap) f02.f17374c);
                                    break;
                                } else {
                                    aVar.m0(arrayList);
                                    break;
                                }
                            } else {
                                aVar.n0(arrayList);
                                break;
                            }
                        case 2:
                            if (!c1282d.f(aVar)) {
                                if (!equals2) {
                                    pVar.error((String) f02.f17375d, (String) f02.f17376e, (HashMap) f02.f17374c);
                                    break;
                                } else {
                                    aVar.m0(arrayList);
                                    break;
                                }
                            } else {
                                aVar.n0(arrayList);
                                break;
                            }
                        case 3:
                            if (!c1282d.e(aVar)) {
                                if (!equals2) {
                                    pVar.error((String) f02.f17375d, (String) f02.f17376e, (HashMap) f02.f17374c);
                                    break;
                                } else {
                                    aVar.m0(arrayList);
                                    break;
                                }
                            } else {
                                aVar.n0(arrayList);
                                break;
                            }
                        default:
                            pVar.error("bad_param", AbstractC0486a1.h("Batch method '", K7, "' not supported"), null);
                            break;
                    }
                }
                if (!equals) {
                    pVar.success(arrayList);
                    break;
                } else {
                    pVar.success(null);
                    break;
                }
        }
    }

    public /* synthetic */ i(o oVar, C1282d c1282d, p pVar) {
        this.f14037a = 3;
        this.f14038b = oVar;
        this.f14040d = c1282d;
        this.f14039c = pVar;
    }

    public /* synthetic */ i(C1282d c1282d, o oVar, p pVar) {
        this.f14037a = 6;
        this.f14040d = c1282d;
        this.f14038b = oVar;
        this.f14039c = pVar;
    }
}
