package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class A4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7531a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7532b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7533c;

    public /* synthetic */ A4(int i, Object obj, Object obj2) {
        this.f7531a = i;
        this.f7532b = obj;
        this.f7533c = obj2;
    }

    private final Object a() {
        C0634Ld c0634Ld;
        C1071hd c1071hd = (C1071hd) this.f7532b;
        C1428pc c1428pc = (C1428pc) this.f7533c;
        C1348nm c1348nm = (C1348nm) c1071hd.f13763n;
        synchronized (c1348nm.f15169l) {
            try {
                if (c1348nm.f15170m) {
                    c0634Ld = c1348nm.f15168k;
                } else {
                    c1348nm.f15170m = true;
                    c1348nm.f15172o = c1428pc;
                    c1348nm.f15173p.n();
                    c1348nm.f15168k.f10334k.a(new RunnableC1303mm(0, c1348nm), AbstractC0613Id.f9544g);
                    AbstractC1483qm.b(c1348nm.f14708r, c1348nm.f15168k, c1348nm.f14709s);
                    c0634Ld = c1348nm.f15168k;
                }
            } finally {
            }
        }
        return (C1842ym) c0634Ld.f10334k.get(((Integer) Q2.r.f5053d.f5056c.a(F7.m5)).intValue(), TimeUnit.SECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0250 A[Catch: InterruptedException | ExecutionException -> 0x02bc, TRY_ENTER, TRY_LEAVE, TryCatch #4 {InterruptedException | ExecutionException -> 0x02bc, blocks: (B:111:0x0250, B:112:0x02af, B:112:0x02af, B:122:0x02ab, B:122:0x02ab), top: B:109:0x024e }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0255 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        String str;
        boolean equals;
        int i;
        Future c02;
        String str2;
        RunnableFutureC0823bx runnableFutureC0823bx;
        C1367o4 c1367o4;
        C1562sc a5;
        int i5 = 0;
        switch (this.f7531a) {
            case 0:
                C0905dr c0905dr = (C0905dr) this.f7532b;
                C0786b4 c0786b4 = (C0786b4) c0905dr.f13188n;
                U4 u42 = (U4) c0905dr.f13187m;
                if (u42 != null && !c0786b4.z() && (runnableFutureC0823bx = (RunnableFutureC0823bx) u42.f11722l) != null && (Build.VERSION.SDK_INT < 31 || runnableFutureC0823bx.isDone())) {
                    try {
                        c1367o4 = (C1367o4) runnableFutureC0823bx.get(c0786b4.w(), TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    }
                    if (c1367o4 != null && c1367o4.g0()) {
                        str = c1367o4.u0();
                        equals = str.equals("E");
                        Context context = (Context) this.f7533c;
                        if (equals && (i = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                if (i >= 31) {
                                    c02 = AbstractC1400ot.c0("");
                                } else {
                                    try {
                                        String packageName = context.getPackageName();
                                        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                                        Nv nv = Qv.f11286d;
                                        byte[] h3 = nv.d().h("308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a");
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(h3)));
                                        if (!Build.TYPE.equals("user")) {
                                            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(nv.d().h("308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"))));
                                        }
                                        B4 b42 = new B4();
                                        context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, b42);
                                        c02 = b42.f7767b;
                                    } catch (Throwable unused2) {
                                        c02 = AbstractC1400ot.c0("");
                                    }
                                }
                                str2 = (String) c02.get();
                                if (true != AbstractC0952et.u(str2)) {
                                    str = str2;
                                }
                            } catch (InterruptedException | ExecutionException unused3) {
                            }
                        }
                        if (!str.equals("E") && !c0786b4.y()) {
                            try {
                                return C0905dr.B(context);
                            } catch (ClassCastException unused4) {
                                return str;
                            }
                        }
                    }
                }
                str = "E";
                equals = str.equals("E");
                Context context2 = (Context) this.f7533c;
                if (equals) {
                    if (i >= 31) {
                    }
                    str2 = (String) c02.get();
                    if (true != AbstractC0952et.u(str2)) {
                    }
                }
                return !str.equals("E") ? str : str;
            case 1:
                C0965f5 c0965f5 = (C0965f5) this.f7532b;
                U4 u43 = c0965f5.f13447l;
                if ((u43 != null ? (RunnableFutureC0823bx) u43.f11722l : c0965f5.f13446k) != null) {
                    (u43 != null ? (RunnableFutureC0823bx) u43.f11722l : c0965f5.f13446k).get();
                }
                C1367o4 b3 = ((C0965f5) this.f7532b).b();
                if (b3 != null) {
                    try {
                        synchronized (((C0919e4) this.f7533c)) {
                            C0919e4 c0919e4 = (C0919e4) this.f7533c;
                            byte[] d5 = b3.d();
                            GB gb = GB.f9177a;
                            C1285mC c1285mC = C1285mC.f14484c;
                            c0919e4.a(d5, GB.f9178b);
                        }
                    } catch (XB | NullPointerException unused5) {
                    }
                }
                return null;
            case 2:
                Mt mt = (Mt) this.f7532b;
                WeakHashMap weakHashMap = (WeakHashMap) mt.f10741l;
                Context context3 = (Context) this.f7533c;
                C1607tc c1607tc = (C1607tc) weakHashMap.get(context3);
                if (c1607tc != null) {
                    long longValue = c1607tc.f15688a + ((Long) Z7.f12454d.s()).longValue();
                    P2.o.f4767B.f4776j.getClass();
                    if (longValue >= System.currentTimeMillis()) {
                        a5 = new C1517rc(context3, c1607tc.f15689b).a();
                        ((WeakHashMap) mt.f10741l).put(context3, new C1607tc(a5));
                        return a5;
                    }
                }
                a5 = new C1517rc(context3).a();
                ((WeakHashMap) mt.f10741l).put(context3, new C1607tc(a5));
                return a5;
            case 3:
                return (String) ((C1204kd) this.f7532b).h((Context) this.f7533c, "getAppInstanceId");
            case 4:
                Kl kl = (Kl) this.f7532b;
                kl.f10232e.b(Boolean.TRUE);
                Jr jr = (Jr) this.f7533c;
                jr.g(true);
                kl.f10241p.b(jr.l());
                return null;
            case 5:
                return a();
            case 6:
                return (C1842ym) ((C0634Ld) ((C1348nm) ((C0375o) this.f7532b).f5045o).d((C1428pc) this.f7533c)).f10334k.get(((Integer) Q2.r.f5053d.f5056c.a(F7.m5)).intValue(), TimeUnit.SECONDS);
            case 7:
                Hm hm = (Hm) this.f7533c;
                C1258lm c1258lm = (C1258lm) this.f7532b;
                c1258lm.c(28);
                int i6 = -1;
                while (true) {
                    try {
                        A7 a7 = F7.K6;
                        Q2.r rVar = Q2.r.f5053d;
                        if (i5 >= ((Integer) rVar.f5056c.a(a7)).intValue()) {
                            throw new C0858co("Received HTTP error code from ad server: " + i6, 1);
                        }
                        Context context4 = c1258lm.f14412b;
                        String str3 = c1258lm.f14413c.f5852k;
                        Binder.getCallingUid();
                        Im p5 = new C0709Wb(24, context4, str3).p(hm);
                        int i7 = p5.f9614a;
                        if (((Boolean) rVar.f5056c.a(F7.L6)).booleanValue()) {
                            c1258lm.i.a("fr", String.valueOf(i5));
                        }
                        if (i7 == 200) {
                            c1258lm.c(29);
                            return p5.f9616c;
                        }
                        i5++;
                        i6 = i7;
                    } catch (Exception e3) {
                        throw new C0858co(e3.getMessage() == null ? "Fetch failed." : e3.getMessage(), e3);
                    }
                }
            case 8:
                Im im = (Im) ((Cr) this.f7532b).f8093m.get();
                Object obj = ((Mw) this.f7533c).f10752k;
                return new Fm(im, ((Em) obj).f8587b, ((Em) obj).f8586a);
            case 9:
                C1530rp c1530rp = Gp.f9266k;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = (ArrayList) this.f7532b;
                int size = arrayList2.size();
                while (i5 < size) {
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    E3.a aVar = (E3.a) obj2;
                    if (((JSONObject) aVar.get()) != null) {
                        jSONArray.put(aVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new C1530rp(1, jSONArray.toString(), (Bundle) this.f7533c);
            default:
                return ((C1041gs) this.f7532b).f13669d.d((String) this.f7533c);
        }
    }
}
