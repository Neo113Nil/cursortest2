package K5;

import B.v;
import C0.C0083b;
import E4.K;
import E5.C0185c;
import E5.C0199q;
import U5.p0;
import W5.A1;
import Y4.D;
import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.w;
import io.sentry.protocol.SentryStackTrace;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import w1.F0;
import w1.V0;

/* loaded from: classes2.dex */
public interface g {
    static void a(A5.f fVar, final b bVar) {
        h hVar = h.f4110d;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.getReferencebyPath", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i7 = 0;
            f02.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i7) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.setMaxOperationRetryTime", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i8 = 1;
            f03.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i8) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.setMaxUploadRetryTime", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i9 = 2;
            f04.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i9) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f04.M(null);
        }
        F0 f05 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.setMaxDownloadRetryTime", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i10 = 3;
            f05.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f05.M(null);
        }
        F0 f06 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.useStorageEmulator", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i11 = 4;
            f06.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f06.M(null);
        }
        F0 f07 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceDelete", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i12 = 5;
            f07.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i12) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f07.M(null);
        }
        F0 f08 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceGetDownloadURL", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i13 = 6;
            f08.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i13) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f08.M(null);
        }
        F0 f09 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceGetMetaData", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i14 = 7;
            f09.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i14) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f09.M(null);
        }
        F0 f010 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceList", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i15 = 8;
            f010.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i15) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f010.M(null);
        }
        F0 f011 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceListAll", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i16 = 9;
            f011.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i16) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f011.M(null);
        }
        F0 f012 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceGetData", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i17 = 10;
            f012.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i17) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f012.M(null);
        }
        F0 f013 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referencePutData", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i18 = 11;
            f013.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i18) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f013.M(null);
        }
        F0 f014 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referencePutString", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i19 = 12;
            f014.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i19) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f014.M(null);
        }
        F0 f015 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referencePutFile", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i20 = 13;
            f015.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i20) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f015.M(null);
        }
        F0 f016 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceDownloadFile", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i21 = 14;
            f016.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i21) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f016.M(null);
        }
        F0 f017 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.referenceUpdateMetadata", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i22 = 15;
            f017.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f017.M(null);
        }
        F0 f018 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.taskPause", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i23 = 16;
            f018.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i23) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f018.M(null);
        }
        F0 f019 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.taskResume", hVar, (Object) null, 1);
        if (bVar != null) {
            final int i24 = 17;
            f019.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i24) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        } else {
            f019.M(null);
        }
        F0 f020 = new F0(fVar, "dev.flutter.pigeon.firebase_storage_platform_interface.FirebaseStorageHostApi.taskCancel", hVar, (Object) null, 1);
        if (bVar == null) {
            f020.M(null);
        } else {
            final int i25 = 18;
            f020.M(new A5.b() { // from class: K5.d
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    Task c3;
                    switch (i25) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            n nVar = (n) arrayList2.get(0);
                            String str = (String) arrayList2.get(1);
                            bVar.getClass();
                            arrayList.add(0, b.c(b.e(nVar).d(str)));
                            v02.f(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            n nVar2 = (n) arrayList4.get(0);
                            Number number = (Number) arrayList4.get(1);
                            Long valueOf = number == null ? null : Long.valueOf(number.longValue());
                            bVar.getClass();
                            b.e(nVar2).f12018g = valueOf.longValue();
                            arrayList3.add(0, null);
                            v02.f(arrayList3);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            n nVar3 = (n) arrayList6.get(0);
                            Number number2 = (Number) arrayList6.get(1);
                            Long valueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
                            bVar.getClass();
                            b.e(nVar3).f12016e = valueOf2.longValue();
                            arrayList5.add(0, null);
                            v02.f(arrayList5);
                            return;
                        case 3:
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            n nVar4 = (n) arrayList8.get(0);
                            Number number3 = (Number) arrayList8.get(1);
                            Long valueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
                            bVar.getClass();
                            b.e(nVar4).f12017f = valueOf3.longValue();
                            arrayList7.add(0, null);
                            v02.f(arrayList7);
                            return;
                        case 4:
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList arrayList10 = (ArrayList) obj;
                            n nVar5 = (n) arrayList10.get(0);
                            String str2 = (String) arrayList10.get(1);
                            Number number4 = (Number) arrayList10.get(2);
                            Long valueOf4 = number4 == null ? null : Long.valueOf(number4.longValue());
                            bVar.getClass();
                            try {
                                b.e(nVar5).f12019h = new v(str2, valueOf4.intValue(), 14);
                                arrayList9.add(0, null);
                                v02.f(arrayList9);
                                return;
                            } catch (Exception e7) {
                                v02.f(D.g0(Q0.a.I(e7)));
                                return;
                            }
                        case 5:
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = (ArrayList) obj;
                            n nVar6 = (n) arrayList12.get(0);
                            o oVar = (o) arrayList12.get(1);
                            e eVar = new e(arrayList11, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d7 = b.e(nVar6).d(oVar.f4128b);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar = new com.google.firebase.storage.c(0);
                            cVar.f11998b = d7;
                            cVar.f11999c = taskCompletionSource;
                            com.google.firebase.storage.f fVar2 = d7.f12045b;
                            Y3.i iVar = fVar2.f12012a;
                            iVar.b();
                            cVar.f12000d = new S4.e(iVar.f7663a, fVar2.b(), fVar2.a(), fVar2.f12017f);
                            D.f7694f.execute(cVar);
                            taskCompletionSource.getTask().addOnCompleteListener(new C0185c(eVar, 26));
                            return;
                        case 6:
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = (ArrayList) obj;
                            n nVar7 = (n) arrayList14.get(0);
                            o oVar2 = (o) arrayList14.get(1);
                            f fVar3 = new f(arrayList13, v02, 0);
                            bVar.getClass();
                            com.google.firebase.storage.m d8 = b.e(nVar7).d(oVar2.f4128b);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            com.google.firebase.storage.c cVar2 = new com.google.firebase.storage.c(1);
                            cVar2.f11998b = d8;
                            cVar2.f11999c = taskCompletionSource2;
                            Uri build = d8.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build != null);
                            com.google.firebase.storage.f fVar4 = d8.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar4 != null);
                            String path = build.getPath();
                            int lastIndexOf = path.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                path = path.substring(lastIndexOf + 1);
                            }
                            if (path.equals(d8.a())) {
                                throw new IllegalArgumentException("getDownloadUrl() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar2 = fVar4.f12012a;
                            iVar2.b();
                            cVar2.f12000d = new S4.e(iVar2.f7663a, fVar4.b(), fVar4.a(), fVar4.f12018g);
                            D.f7694f.execute(cVar2);
                            taskCompletionSource2.getTask().addOnCompleteListener(new C0185c(fVar3, 28));
                            return;
                        case 7:
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = (ArrayList) obj;
                            n nVar8 = (n) arrayList16.get(0);
                            o oVar3 = (o) arrayList16.get(1);
                            e eVar2 = new e(arrayList15, v02, 1);
                            b bVar2 = bVar;
                            bVar2.getClass();
                            com.google.firebase.storage.m d9 = b.e(nVar8).d(oVar3.f4128b);
                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                            A2.c cVar3 = new A2.c();
                            cVar3.f620b = d9;
                            cVar3.f621c = taskCompletionSource3;
                            Uri build2 = d9.f12044a.buildUpon().path("").build();
                            com.google.android.gms.common.internal.D.a("storageUri cannot be null", build2 != null);
                            com.google.firebase.storage.f fVar5 = d9.f12045b;
                            com.google.android.gms.common.internal.D.a("FirebaseApp cannot be null", fVar5 != null);
                            String path2 = build2.getPath();
                            int lastIndexOf2 = path2.lastIndexOf(47);
                            if (lastIndexOf2 != -1) {
                                path2 = path2.substring(lastIndexOf2 + 1);
                            }
                            if (path2.equals(d9.a())) {
                                throw new IllegalArgumentException("getMetadata() is not supported at the root of the bucket.");
                            }
                            Y3.i iVar3 = fVar5.f12012a;
                            iVar3.b();
                            cVar3.f623e = new S4.e(iVar3.f7663a, fVar5.b(), fVar5.a(), fVar5.f12017f);
                            D.f7694f.execute(cVar3);
                            taskCompletionSource3.getTask().addOnCompleteListener(new K(7, bVar2, eVar2));
                            return;
                        case 8:
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = (ArrayList) obj;
                            n nVar9 = (n) arrayList18.get(0);
                            o oVar4 = (o) arrayList18.get(1);
                            k kVar = (k) arrayList18.get(2);
                            f fVar6 = new f(arrayList17, v02, 1);
                            b bVar3 = bVar;
                            bVar3.getClass();
                            com.google.firebase.storage.m d10 = b.e(nVar9).d(oVar4.f4128b);
                            if (kVar.f4114b != null) {
                                int intValue = kVar.f4113a.intValue();
                                String str3 = kVar.f4114b;
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue <= 1000);
                                com.google.android.gms.common.internal.D.a("pageToken must be non-null to resume a previous list() operation", str3 != null);
                                c3 = d10.c(str3, Integer.valueOf(intValue));
                            } else {
                                int intValue2 = kVar.f4113a.intValue();
                                com.google.android.gms.common.internal.D.a("maxResults must be greater than zero", intValue2 > 0);
                                com.google.android.gms.common.internal.D.a("maxResults must be at most 1000", intValue2 <= 1000);
                                c3 = d10.c(null, Integer.valueOf(intValue2));
                            }
                            c3.addOnCompleteListener(new K(8, bVar3, fVar6));
                            return;
                        case 9:
                            ArrayList arrayList19 = new ArrayList();
                            ArrayList arrayList20 = (ArrayList) obj;
                            n nVar10 = (n) arrayList20.get(0);
                            o oVar5 = (o) arrayList20.get(1);
                            C0199q c0199q = new C0199q(arrayList19, v02, 28);
                            b bVar4 = bVar;
                            bVar4.getClass();
                            com.google.firebase.storage.m d11 = b.e(nVar10).d(oVar5.f4128b);
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            ArrayList arrayList21 = new ArrayList();
                            ArrayList arrayList22 = new ArrayList();
                            p0 p0Var = D.f7694f;
                            d11.c(null, null).continueWithTask(p0Var, new I4.j(d11, arrayList21, arrayList22, p0Var, taskCompletionSource4));
                            taskCompletionSource4.getTask().addOnCompleteListener(new K(6, bVar4, c0199q));
                            return;
                        case 10:
                            b bVar5 = bVar;
                            ArrayList arrayList23 = new ArrayList();
                            ArrayList arrayList24 = (ArrayList) obj;
                            n nVar11 = (n) arrayList24.get(0);
                            o oVar6 = (o) arrayList24.get(1);
                            Number number5 = (Number) arrayList24.get(2);
                            E5.r rVar = new E5.r(arrayList23, v02, 29);
                            Long valueOf5 = number5 == null ? null : Long.valueOf(number5.longValue());
                            bVar5.getClass();
                            com.google.firebase.storage.m d12 = b.e(nVar11).d(oVar6.f4128b);
                            long longValue = valueOf5.longValue();
                            TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                            w wVar = new w();
                            wVar.f12080n = null;
                            wVar.f12081o = 0;
                            wVar.f12078l = d12;
                            com.google.firebase.storage.f fVar7 = d12.f12045b;
                            Y3.i iVar4 = fVar7.f12012a;
                            iVar4.b();
                            wVar.f12079m = new S4.e(iVar4.f7663a, fVar7.b(), fVar7.a(), fVar7.f12017f);
                            C0083b c0083b = new C0083b(longValue, taskCompletionSource5, 7);
                            com.google.android.gms.common.internal.D.l(wVar.f12082p == null);
                            wVar.f12082p = c0083b;
                            wVar.f12060b.b(null, null, new com.google.firebase.storage.l(taskCompletionSource5));
                            wVar.f12061c.b(null, null, new com.google.firebase.storage.k(taskCompletionSource5));
                            wVar.h();
                            taskCompletionSource5.getTask().addOnCompleteListener(new C0185c(rVar, 27));
                            return;
                        case 11:
                            ArrayList arrayList25 = new ArrayList();
                            ArrayList arrayList26 = (ArrayList) obj;
                            n nVar12 = (n) arrayList26.get(0);
                            o oVar7 = (o) arrayList26.get(1);
                            byte[] bArr = (byte[]) arrayList26.get(2);
                            m mVar = (m) arrayList26.get(3);
                            Number number6 = (Number) arrayList26.get(4);
                            Long valueOf6 = number6 == null ? null : Long.valueOf(number6.longValue());
                            b bVar6 = bVar;
                            bVar6.getClass();
                            c cVar4 = new c(2, valueOf6.intValue(), b.e(nVar12).d(oVar7.f4128b), bArr, null, b.d(mVar));
                            try {
                                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar6.g(lowerCase, cVar4.e(lowerCase));
                                arrayList25.add(0, lowerCase);
                                v02.f(arrayList25);
                                return;
                            } catch (Exception e8) {
                                v02.f(D.g0(Q0.a.I(e8)));
                                return;
                            }
                        case 12:
                            ArrayList arrayList27 = new ArrayList();
                            ArrayList arrayList28 = (ArrayList) obj;
                            n nVar13 = (n) arrayList28.get(0);
                            o oVar8 = (o) arrayList28.get(1);
                            String str4 = (String) arrayList28.get(2);
                            Number number7 = (Number) arrayList28.get(3);
                            m mVar2 = (m) arrayList28.get(4);
                            Number number8 = (Number) arrayList28.get(5);
                            byte[] bArr2 = null;
                            Long valueOf7 = number7 == null ? null : Long.valueOf(number7.longValue());
                            Long valueOf8 = number8 == null ? null : Long.valueOf(number8.longValue());
                            b bVar7 = bVar;
                            bVar7.getClass();
                            com.google.firebase.storage.m d13 = b.e(nVar13).d(oVar8.f4128b);
                            com.google.firebase.storage.j d14 = b.d(mVar2);
                            int intValue3 = valueOf8.intValue();
                            int intValue4 = valueOf7.intValue();
                            if (intValue4 == 1) {
                                bArr2 = Base64.decode(str4, 0);
                            } else if (intValue4 == 2) {
                                bArr2 = Base64.decode(str4, 8);
                            }
                            c cVar5 = new c(2, intValue3, d13, bArr2, null, d14);
                            try {
                                String lowerCase2 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar7.g(lowerCase2, cVar5.e(lowerCase2));
                                arrayList27.add(0, lowerCase2);
                                v02.f(arrayList27);
                                return;
                            } catch (Exception e9) {
                                v02.f(D.g0(Q0.a.I(e9)));
                                return;
                            }
                        case 13:
                            ArrayList arrayList29 = new ArrayList();
                            ArrayList arrayList30 = (ArrayList) obj;
                            n nVar14 = (n) arrayList30.get(0);
                            o oVar9 = (o) arrayList30.get(1);
                            String str5 = (String) arrayList30.get(2);
                            m mVar3 = (m) arrayList30.get(3);
                            Number number9 = (Number) arrayList30.get(4);
                            Long valueOf9 = number9 == null ? null : Long.valueOf(number9.longValue());
                            b bVar8 = bVar;
                            bVar8.getClass();
                            c cVar6 = new c(1, valueOf9.intValue(), b.e(nVar14).d(oVar9.f4128b), null, Uri.fromFile(new File(str5)), mVar3 != null ? b.d(mVar3) : null);
                            try {
                                String lowerCase3 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar8.g(lowerCase3, cVar6.e(lowerCase3));
                                arrayList29.add(0, lowerCase3);
                                v02.f(arrayList29);
                                return;
                            } catch (Exception e10) {
                                v02.f(D.g0(Q0.a.I(e10)));
                                return;
                            }
                        case 14:
                            ArrayList arrayList31 = new ArrayList();
                            ArrayList arrayList32 = (ArrayList) obj;
                            n nVar15 = (n) arrayList32.get(0);
                            o oVar10 = (o) arrayList32.get(1);
                            String str6 = (String) arrayList32.get(2);
                            Number number10 = (Number) arrayList32.get(3);
                            Long valueOf10 = number10 == null ? null : Long.valueOf(number10.longValue());
                            b bVar9 = bVar;
                            bVar9.getClass();
                            c cVar7 = new c(3, valueOf10.intValue(), b.e(nVar15).d(oVar10.f4128b), null, Uri.fromFile(new File(str6)), null);
                            try {
                                String lowerCase4 = UUID.randomUUID().toString().toLowerCase(Locale.US);
                                bVar9.g(lowerCase4, cVar7.e(lowerCase4));
                                arrayList31.add(0, lowerCase4);
                                v02.f(arrayList31);
                                return;
                            } catch (Exception e11) {
                                v02.f(D.g0(Q0.a.I(e11)));
                                return;
                            }
                        case 15:
                            ArrayList arrayList33 = new ArrayList();
                            ArrayList arrayList34 = (ArrayList) obj;
                            n nVar16 = (n) arrayList34.get(0);
                            o oVar11 = (o) arrayList34.get(1);
                            m mVar4 = (m) arrayList34.get(2);
                            C0199q c0199q2 = new C0199q(arrayList33, v02, 29);
                            b bVar10 = bVar;
                            bVar10.getClass();
                            com.google.firebase.storage.m d15 = b.e(nVar16).d(oVar11.f4128b);
                            com.google.firebase.storage.j d16 = b.d(mVar4);
                            TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                            D.f7694f.execute(new A1(d15, taskCompletionSource6, d16));
                            taskCompletionSource6.getTask().addOnCompleteListener(new K(5, bVar10, c0199q2));
                            return;
                        case 16:
                            ArrayList arrayList35 = new ArrayList();
                            ArrayList arrayList36 = (ArrayList) obj;
                            Number number11 = (Number) arrayList36.get(1);
                            Long valueOf11 = number11 == null ? null : Long.valueOf(number11.longValue());
                            bVar.getClass();
                            c c4 = c.c(valueOf11.intValue());
                            if (c4 == null) {
                                v02.f(D.g0(new i("unknown", "Pause operation was called on a task which does not exist.")));
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            try {
                                boolean g3 = c4.j.g();
                                hashMap.put("status", Boolean.valueOf(g3));
                                if (g3) {
                                    hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c4.j.m()));
                                }
                                arrayList35.add(0, hashMap);
                                v02.f(arrayList35);
                                return;
                            } catch (Exception e12) {
                                v02.f(D.g0(Q0.a.I(e12)));
                                return;
                            }
                        case 17:
                            ArrayList arrayList37 = new ArrayList();
                            ArrayList arrayList38 = (ArrayList) obj;
                            Number number12 = (Number) arrayList38.get(1);
                            Long valueOf12 = number12 == null ? null : Long.valueOf(number12.longValue());
                            bVar.getClass();
                            c c7 = c.c(valueOf12.intValue());
                            if (c7 == null) {
                                v02.f(D.g0(new i("unknown", "Resume operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean j = c7.j.j();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("status", Boolean.valueOf(j));
                                if (j) {
                                    hashMap2.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c7.j.m()));
                                }
                                arrayList37.add(0, hashMap2);
                                v02.f(arrayList37);
                                return;
                            } catch (Exception e13) {
                                v02.f(D.g0(Q0.a.I(e13)));
                                return;
                            }
                        default:
                            ArrayList arrayList39 = new ArrayList();
                            ArrayList arrayList40 = (ArrayList) obj;
                            Number number13 = (Number) arrayList40.get(1);
                            Long valueOf13 = number13 == null ? null : Long.valueOf(number13.longValue());
                            bVar.getClass();
                            c c8 = c.c(valueOf13.intValue());
                            if (c8 == null) {
                                v02.f(D.g0(new i("unknown", "Cancel operation was called on a task which does not exist.")));
                                return;
                            }
                            try {
                                boolean p5 = c8.j.p(new int[]{256, 32}, true);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("status", Boolean.valueOf(p5));
                                if (p5) {
                                    hashMap3.put(SentryStackTrace.JsonKeys.SNAPSHOT, c.d(c8.j.m()));
                                }
                                arrayList39.add(0, hashMap3);
                                v02.f(arrayList39);
                                return;
                            } catch (Exception e14) {
                                v02.f(D.g0(Q0.a.I(e14)));
                                return;
                            }
                    }
                }
            });
        }
    }
}
