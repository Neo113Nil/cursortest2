package p000;

/* JADX INFO: renamed from: bp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0070bp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ br0 f938a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i01 f939b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k01 f940c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0848wp f941d;

    public C0070bp(br0 br0Var, i01 i01Var, k01 k01Var, C0848wp c0848wp) {
        this.f938a = br0Var;
        this.f939b = i01Var;
        this.f940c = k01Var;
        this.f941d = c0848wp;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00a8, B:37:0x00b0), top: B:52:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m734a(C0773uo c0773uo, AbstractC0882xm abstractC0882xm) throws Throwable {
        C0033ap c0033ap;
        br0 br0Var;
        i01 i01Var;
        k01 k01Var;
        C0848wp c0848wp;
        v60 v60Var;
        br0 br0Var2;
        br0 br0Var3;
        k01 k01Var2;
        Object obj;
        if (abstractC0882xm instanceof C0033ap) {
            c0033ap = (C0033ap) abstractC0882xm;
            int i = c0033ap.f587t;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0033ap.f587t = i - Integer.MIN_VALUE;
            } else {
                c0033ap = new C0033ap(this, abstractC0882xm);
            }
        } else {
            c0033ap = new C0033ap(this, abstractC0882xm);
        }
        Object obj2 = c0033ap.f585r;
        int i2 = c0033ap.f587t;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        try {
            if (i2 == 0) {
                wo1.m5395v(obj2);
                c0033ap.f580m = c0773uo;
                br0Var = this.f938a;
                c0033ap.f581n = br0Var;
                i01Var = this.f939b;
                c0033ap.f582o = i01Var;
                k01Var = this.f940c;
                c0033ap.f583p = k01Var;
                c0848wp = this.f941d;
                c0033ap.f584q = c0848wp;
                c0033ap.f587t = 1;
                if (br0Var.m745d(c0033ap) != enumC0513nn) {
                }
                v60Var = c0773uo;
                return enumC0513nn;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = c0033ap.f582o;
                    k01Var2 = (k01) c0033ap.f581n;
                    br0Var2 = (br0) c0033ap.f580m;
                    try {
                        wo1.m5395v(obj2);
                        k01Var2.f4243j = obj;
                        Object obj3 = k01Var2.f4243j;
                        br0Var2.m748g(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        br0Var2.m748g(null);
                        throw th;
                    }
                }
                c0848wp = (C0848wp) c0033ap.f582o;
                k01Var2 = (k01) c0033ap.f581n;
                br0Var3 = (br0) c0033ap.f580m;
                try {
                    wo1.m5395v(obj2);
                    if (!af0.m187a(obj2, k01Var2.f4243j)) {
                        c0033ap.f580m = br0Var3;
                        c0033ap.f581n = k01Var2;
                        c0033ap.f582o = obj2;
                        c0033ap.f587t = 3;
                        if (c0848wp.m5408k(obj2, false, c0033ap) != enumC0513nn) {
                            obj = obj2;
                            br0Var2 = br0Var3;
                            k01Var2.f4243j = obj;
                        }
                        v60Var = c0773uo;
                        return enumC0513nn;
                    }
                    br0Var2 = br0Var3;
                    Object obj4 = k01Var2.f4243j;
                    br0Var2.m748g(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    br0Var2 = br0Var3;
                    br0Var2.m748g(null);
                    throw th;
                }
            }
            c0848wp = c0033ap.f584q;
            k01 k01Var3 = c0033ap.f583p;
            i01Var = (i01) c0033ap.f582o;
            br0 br0Var4 = (br0) c0033ap.f581n;
            v60 v60Var2 = (v60) c0033ap.f580m;
            wo1.m5395v(obj2);
            k01Var = k01Var3;
            v60Var = v60Var2;
            br0Var = br0Var4;
            v60Var = c0773uo;
            if (i01Var.f3369j) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = k01Var.f4243j;
            c0033ap.f580m = br0Var;
            c0033ap.f581n = k01Var;
            c0033ap.f582o = c0848wp;
            c0033ap.f583p = null;
            c0033ap.f584q = null;
            c0033ap.f587t = 2;
            Object objMo1490g = v60Var.mo1490g(obj5, c0033ap);
            if (objMo1490g != enumC0513nn) {
                br0Var3 = br0Var;
                obj2 = objMo1490g;
                k01Var2 = k01Var;
                if (!af0.m187a(obj2, k01Var2.f4243j)) {
                    c0033ap.f580m = br0Var3;
                    c0033ap.f581n = k01Var2;
                    c0033ap.f582o = obj2;
                    c0033ap.f587t = 3;
                    if (c0848wp.m5408k(obj2, false, c0033ap) != enumC0513nn) {
                        obj = obj2;
                        br0Var2 = br0Var3;
                        k01Var2.f4243j = obj;
                    }
                } else {
                    br0Var2 = br0Var3;
                }
                Object obj6 = k01Var2.f4243j;
                br0Var2.m748g(null);
                return obj6;
            }
            v60Var = c0773uo;
            return enumC0513nn;
        } catch (Throwable th3) {
            th = th3;
            br0Var2 = br0Var;
            br0Var2.m748g(null);
            throw th;
        }
    }
}
