package p064i5;

import A5.o;
import A5.p;
import W5.AbstractC0486a1;
import android.database.Cursor;
import android.util.Log;
import io.sentry.protocol.Device;
import j5.a;
import j5.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p113p3.f;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f14045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f14046d;

    public /* synthetic */ i(o oVar, p pVar, d dVar, int i7) {
        this.f14043a = i7;
        this.f14044b = oVar;
        this.f14045c = pVar;
        this.f14046d = dVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x005e  */
    @Override // java.lang.Runnable
    public final void run() {
        final int i7 = 3;
        final int i8 = 2;
        final int i9 = 1;
        final int i10 = 0;
        o oVar = this.f14044b;
        p pVar = this.f14045c;
        final d dVar = this.f14046d;
        switch (this.f14043a) {
            case 0:
                HashMap map = k.f14058c;
                final b bVar = new b(oVar, pVar);
                dVar.l(bVar, new Runnable() { // from class: i5.b
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i10) {
                            case 0:
                                d dVar2 = dVar;
                                j5.b bVar2 = bVar;
                                o oVar2 = bVar2.f14646e;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (a.b(dVar2.f14023d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(dVar2.h());
                                    sb.append("cursor ");
                                    sb.append(iIntValue);
                                    sb.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap map2 = dVar2.f14026g;
                                h hVar = null;
                                if (zEquals) {
                                    h hVar2 = (h) map2.get(num);
                                    if (hVar2 != null) {
                                        dVar2.b(hVar2);
                                    }
                                    bVar2.f(null);
                                    return;
                                }
                                h hVar3 = (h) map2.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (hVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = hVar3.f14042c;
                                        HashMap mapC = d.c(cursor, Integer.valueOf(hVar3.f14041b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            mapC.put("cursorId", num);
                                        }
                                        bVar2.f(mapC);
                                        if (z4) {
                                            return;
                                        }
                                        dVar2.b(hVar3);
                                        return;
                                    } catch (Exception e7) {
                                        dVar2.i(e7, bVar2);
                                        if (hVar3 != null) {
                                            dVar2.b(hVar3);
                                        } else {
                                            hVar = hVar3;
                                        }
                                        if (0 != 0 || hVar == null) {
                                            return;
                                        }
                                        dVar2.b(hVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && hVar3 != null) {
                                        dVar2.b(hVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                dVar.e(bVar);
                                return;
                            case 2:
                                dVar.f(bVar);
                                return;
                            case 3:
                                dVar.d(bVar);
                                return;
                            default:
                                d dVar3 = dVar;
                                f fVar = bVar;
                                Object objI = fVar.I("inTransaction");
                                Boolean bool = objI instanceof Boolean ? (Boolean) objI : null;
                                boolean z7 = Boolean.TRUE.equals(bool) && fVar.Q() && ((Integer) fVar.I("transactionId")) == null;
                                if (z7) {
                                    int i11 = dVar3.f14029k + 1;
                                    dVar3.f14029k = i11;
                                    dVar3.f14030l = Integer.valueOf(i11);
                                }
                                if (!dVar3.g(fVar)) {
                                    if (z7) {
                                        dVar3.f14030l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap map3 = new HashMap();
                                    map3.put("transactionId", dVar3.f14030l);
                                    fVar.f(map3);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        dVar3.f14030l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                HashMap map2 = k.f14058c;
                final b bVar2 = new b(oVar, pVar);
                dVar.l(bVar2, new Runnable() { // from class: i5.b
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i7) {
                            case 0:
                                d dVar2 = dVar;
                                j5.b bVar3 = bVar2;
                                o oVar2 = bVar3.f14646e;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (a.b(dVar2.f14023d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(dVar2.h());
                                    sb.append("cursor ");
                                    sb.append(iIntValue);
                                    sb.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap map3 = dVar2.f14026g;
                                h hVar = null;
                                if (zEquals) {
                                    h hVar2 = (h) map3.get(num);
                                    if (hVar2 != null) {
                                        dVar2.b(hVar2);
                                    }
                                    bVar3.f(null);
                                    return;
                                }
                                h hVar3 = (h) map3.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (hVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = hVar3.f14042c;
                                        HashMap mapC = d.c(cursor, Integer.valueOf(hVar3.f14041b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            mapC.put("cursorId", num);
                                        }
                                        bVar3.f(mapC);
                                        if (z4) {
                                            return;
                                        }
                                        dVar2.b(hVar3);
                                        return;
                                    } catch (Exception e7) {
                                        dVar2.i(e7, bVar3);
                                        if (hVar3 != null) {
                                            dVar2.b(hVar3);
                                        } else {
                                            hVar = hVar3;
                                        }
                                        if (0 != 0 || hVar == null) {
                                            return;
                                        }
                                        dVar2.b(hVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && hVar3 != null) {
                                        dVar2.b(hVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                dVar.e(bVar2);
                                return;
                            case 2:
                                dVar.f(bVar2);
                                return;
                            case 3:
                                dVar.d(bVar2);
                                return;
                            default:
                                d dVar3 = dVar;
                                f fVar = bVar2;
                                Object objI = fVar.I("inTransaction");
                                Boolean bool = objI instanceof Boolean ? (Boolean) objI : null;
                                boolean z7 = Boolean.TRUE.equals(bool) && fVar.Q() && ((Integer) fVar.I("transactionId")) == null;
                                if (z7) {
                                    int i11 = dVar3.f14029k + 1;
                                    dVar3.f14029k = i11;
                                    dVar3.f14030l = Integer.valueOf(i11);
                                }
                                if (!dVar3.g(fVar)) {
                                    if (z7) {
                                        dVar3.f14030l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap map4 = new HashMap();
                                    map4.put("transactionId", dVar3.f14030l);
                                    fVar.f(map4);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        dVar3.f14030l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 2:
                HashMap map3 = k.f14058c;
                final b bVar3 = new b(oVar, pVar);
                dVar.l(bVar3, new Runnable() { // from class: i5.b
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i9) {
                            case 0:
                                d dVar2 = dVar;
                                j5.b bVar4 = bVar3;
                                o oVar2 = bVar4.f14646e;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (a.b(dVar2.f14023d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(dVar2.h());
                                    sb.append("cursor ");
                                    sb.append(iIntValue);
                                    sb.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap map4 = dVar2.f14026g;
                                h hVar = null;
                                if (zEquals) {
                                    h hVar2 = (h) map4.get(num);
                                    if (hVar2 != null) {
                                        dVar2.b(hVar2);
                                    }
                                    bVar4.f(null);
                                    return;
                                }
                                h hVar3 = (h) map4.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (hVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = hVar3.f14042c;
                                        HashMap mapC = d.c(cursor, Integer.valueOf(hVar3.f14041b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            mapC.put("cursorId", num);
                                        }
                                        bVar4.f(mapC);
                                        if (z4) {
                                            return;
                                        }
                                        dVar2.b(hVar3);
                                        return;
                                    } catch (Exception e7) {
                                        dVar2.i(e7, bVar4);
                                        if (hVar3 != null) {
                                            dVar2.b(hVar3);
                                        } else {
                                            hVar = hVar3;
                                        }
                                        if (0 != 0 || hVar == null) {
                                            return;
                                        }
                                        dVar2.b(hVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && hVar3 != null) {
                                        dVar2.b(hVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                dVar.e(bVar3);
                                return;
                            case 2:
                                dVar.f(bVar3);
                                return;
                            case 3:
                                dVar.d(bVar3);
                                return;
                            default:
                                d dVar3 = dVar;
                                f fVar = bVar3;
                                Object objI = fVar.I("inTransaction");
                                Boolean bool = objI instanceof Boolean ? (Boolean) objI : null;
                                boolean z7 = Boolean.TRUE.equals(bool) && fVar.Q() && ((Integer) fVar.I("transactionId")) == null;
                                if (z7) {
                                    int i11 = dVar3.f14029k + 1;
                                    dVar3.f14029k = i11;
                                    dVar3.f14030l = Integer.valueOf(i11);
                                }
                                if (!dVar3.g(fVar)) {
                                    if (z7) {
                                        dVar3.f14030l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap map5 = new HashMap();
                                    map5.put("transactionId", dVar3.f14030l);
                                    fVar.f(map5);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        dVar3.f14030l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 3:
                HashMap map4 = k.f14058c;
                try {
                    dVar.f14028i.setLocale(Locale.forLanguageTag((String) oVar.a(Device.JsonKeys.LOCALE)));
                    pVar.success(null);
                } catch (Exception e7) {
                    pVar.error("sqlite_error", "Error calling setLocale: " + e7.getMessage(), null);
                    return;
                }
                break;
            case 4:
                HashMap map5 = k.f14058c;
                final b bVar4 = new b(oVar, pVar);
                final int i11 = 4;
                dVar.l(bVar4, new Runnable() { // from class: i5.b
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i11) {
                            case 0:
                                d dVar2 = dVar;
                                j5.b bVar5 = bVar4;
                                o oVar2 = bVar5.f14646e;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (a.b(dVar2.f14023d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(dVar2.h());
                                    sb.append("cursor ");
                                    sb.append(iIntValue);
                                    sb.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap map6 = dVar2.f14026g;
                                h hVar = null;
                                if (zEquals) {
                                    h hVar2 = (h) map6.get(num);
                                    if (hVar2 != null) {
                                        dVar2.b(hVar2);
                                    }
                                    bVar5.f(null);
                                    return;
                                }
                                h hVar3 = (h) map6.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (hVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = hVar3.f14042c;
                                        HashMap mapC = d.c(cursor, Integer.valueOf(hVar3.f14041b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            mapC.put("cursorId", num);
                                        }
                                        bVar5.f(mapC);
                                        if (z4) {
                                            return;
                                        }
                                        dVar2.b(hVar3);
                                        return;
                                    } catch (Exception e8) {
                                        dVar2.i(e8, bVar5);
                                        if (hVar3 != null) {
                                            dVar2.b(hVar3);
                                        } else {
                                            hVar = hVar3;
                                        }
                                        if (0 != 0 || hVar == null) {
                                            return;
                                        }
                                        dVar2.b(hVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && hVar3 != null) {
                                        dVar2.b(hVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                dVar.e(bVar4);
                                return;
                            case 2:
                                dVar.f(bVar4);
                                return;
                            case 3:
                                dVar.d(bVar4);
                                return;
                            default:
                                d dVar3 = dVar;
                                f fVar = bVar4;
                                Object objI = fVar.I("inTransaction");
                                Boolean bool = objI instanceof Boolean ? (Boolean) objI : null;
                                boolean z7 = Boolean.TRUE.equals(bool) && fVar.Q() && ((Integer) fVar.I("transactionId")) == null;
                                if (z7) {
                                    int i12 = dVar3.f14029k + 1;
                                    dVar3.f14029k = i12;
                                    dVar3.f14030l = Integer.valueOf(i12);
                                }
                                if (!dVar3.g(fVar)) {
                                    if (z7) {
                                        dVar3.f14030l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap map7 = new HashMap();
                                    map7.put("transactionId", dVar3.f14030l);
                                    fVar.f(map7);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        dVar3.f14030l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 5:
                HashMap map6 = k.f14058c;
                final b bVar5 = new b(oVar, pVar);
                dVar.l(bVar5, new Runnable() { // from class: i5.b
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        switch (i8) {
                            case 0:
                                d dVar2 = dVar;
                                j5.b bVar6 = bVar5;
                                o oVar2 = bVar6.f14646e;
                                Integer num = (Integer) oVar2.a("cursorId");
                                int iIntValue = num.intValue();
                                boolean zEquals = Boolean.TRUE.equals(oVar2.a("cancel"));
                                if (a.b(dVar2.f14023d)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(dVar2.h());
                                    sb.append("cursor ");
                                    sb.append(iIntValue);
                                    sb.append(zEquals ? " cancel" : " next");
                                    Log.d("Sqflite", sb.toString());
                                }
                                HashMap map7 = dVar2.f14026g;
                                h hVar = null;
                                if (zEquals) {
                                    h hVar2 = (h) map7.get(num);
                                    if (hVar2 != null) {
                                        dVar2.b(hVar2);
                                    }
                                    bVar6.f(null);
                                    return;
                                }
                                h hVar3 = (h) map7.get(num);
                                boolean z4 = false;
                                try {
                                    try {
                                        if (hVar3 == null) {
                                            throw new IllegalStateException("Cursor " + iIntValue + " not found");
                                        }
                                        Cursor cursor = hVar3.f14042c;
                                        HashMap mapC = d.c(cursor, Integer.valueOf(hVar3.f14041b));
                                        if (!cursor.isLast() && !cursor.isAfterLast()) {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            mapC.put("cursorId", num);
                                        }
                                        bVar6.f(mapC);
                                        if (z4) {
                                            return;
                                        }
                                        dVar2.b(hVar3);
                                        return;
                                    } catch (Exception e8) {
                                        dVar2.i(e8, bVar6);
                                        if (hVar3 != null) {
                                            dVar2.b(hVar3);
                                        } else {
                                            hVar = hVar3;
                                        }
                                        if (0 != 0 || hVar == null) {
                                            return;
                                        }
                                        dVar2.b(hVar);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    if (0 == 0 && hVar3 != null) {
                                        dVar2.b(hVar3);
                                    }
                                    throw th;
                                }
                            case 1:
                                dVar.e(bVar5);
                                return;
                            case 2:
                                dVar.f(bVar5);
                                return;
                            case 3:
                                dVar.d(bVar5);
                                return;
                            default:
                                d dVar3 = dVar;
                                f fVar = bVar5;
                                Object objI = fVar.I("inTransaction");
                                Boolean bool = objI instanceof Boolean ? (Boolean) objI : null;
                                boolean z7 = Boolean.TRUE.equals(bool) && fVar.Q() && ((Integer) fVar.I("transactionId")) == null;
                                if (z7) {
                                    int i12 = dVar3.f14029k + 1;
                                    dVar3.f14029k = i12;
                                    dVar3.f14030l = Integer.valueOf(i12);
                                }
                                if (!dVar3.g(fVar)) {
                                    if (z7) {
                                        dVar3.f14030l = null;
                                        return;
                                    }
                                    return;
                                } else if (z7) {
                                    HashMap map8 = new HashMap();
                                    map8.put("transactionId", dVar3.f14030l);
                                    fVar.f(map8);
                                    return;
                                } else {
                                    if (Boolean.FALSE.equals(bool)) {
                                        dVar3.f14030l = null;
                                    }
                                    fVar.f(null);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                HashMap map7 = k.f14058c;
                boolean zEquals = Boolean.TRUE.equals(oVar.a("noResult"));
                boolean zEquals2 = Boolean.TRUE.equals(oVar.a("continueOnError"));
                List list = (List) oVar.a("operations");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    a aVar = new a((Map) it.next(), zEquals);
                    String strK = aVar.K();
                    strK.getClass();
                    F0 f7 = aVar.f14643e;
                    switch (strK) {
                        case "execute":
                            if (dVar.g(aVar)) {
                                aVar.f(null);
                                aVar.n0(arrayList);
                                break;
                            } else {
                                if (!zEquals2) {
                                    pVar.error((String) f7.f17381d, (String) f7.f17382e, (HashMap) f7.f17380c);
                                } else {
                                    aVar.m0(arrayList);
                                }
                                break;
                            }
                            break;
                        case "insert":
                            if (dVar.d(aVar)) {
                                aVar.n0(arrayList);
                                break;
                            } else {
                                if (!zEquals2) {
                                    pVar.error((String) f7.f17381d, (String) f7.f17382e, (HashMap) f7.f17380c);
                                } else {
                                    aVar.m0(arrayList);
                                }
                                break;
                            }
                            break;
                        case "update":
                            if (dVar.f(aVar)) {
                                aVar.n0(arrayList);
                                break;
                            } else {
                                if (!zEquals2) {
                                    pVar.error((String) f7.f17381d, (String) f7.f17382e, (HashMap) f7.f17380c);
                                } else {
                                    aVar.m0(arrayList);
                                }
                                break;
                            }
                            break;
                        case "query":
                            if (dVar.e(aVar)) {
                                aVar.n0(arrayList);
                                break;
                            } else {
                                if (!zEquals2) {
                                    pVar.error((String) f7.f17381d, (String) f7.f17382e, (HashMap) f7.f17380c);
                                } else {
                                    aVar.m0(arrayList);
                                }
                                break;
                            }
                            break;
                        default:
                            pVar.error("bad_param", AbstractC0486a1.h("Batch method '", strK, "' not supported"), null);
                            break;
                    }
                }
                if (!zEquals) {
                    pVar.success(arrayList);
                } else {
                    pVar.success(null);
                }
                break;
        }
    }

    public /* synthetic */ i(o oVar, d dVar, p pVar) {
        this.f14043a = 3;
        this.f14044b = oVar;
        this.f14046d = dVar;
        this.f14045c = pVar;
    }

    public /* synthetic */ i(d dVar, o oVar, p pVar) {
        this.f14043a = 6;
        this.f14046d = dVar;
        this.f14044b = oVar;
        this.f14045c = pVar;
    }
}
