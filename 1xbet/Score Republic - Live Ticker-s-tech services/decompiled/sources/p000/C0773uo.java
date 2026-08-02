package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: uo */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0773uo extends xb1 implements v60 {

    /* JADX INFO: renamed from: n */
    public Iterator f7866n;

    /* JADX INFO: renamed from: o */
    public j71 f7867o;

    /* JADX INFO: renamed from: p */
    public Object f7868p;

    /* JADX INFO: renamed from: q */
    public int f7869q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ Object f7870r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ List f7871s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ ArrayList f7872t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0773uo(List list, ArrayList arrayList, InterfaceC0808vm interfaceC0808vm) {
        super(2, interfaceC0808vm);
        this.f7871s = list;
        this.f7872t = arrayList;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        return ((C0773uo) mo1491k((InterfaceC0808vm) obj2, obj)).mo17m(kf1.f4365a);
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: k */
    public final InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        C0773uo c0773uo = new C0773uo(this.f7871s, this.f7872t, interfaceC0808vm);
        c0773uo.f7870r = obj;
        return c0773uo;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final java.lang.Object mo17m(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f7869q
            r1 = 2
            r2 = 1
            r3 = 0
            nn r4 = p000.EnumC0513nn.f5459j
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L17
            java.util.Iterator r0 = r11.f7866n
            java.lang.Object r5 = r11.f7870r
            java.util.List r5 = (java.util.List) r5
            p000.wo1.m5395v(r12)
            goto L3b
        L17:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p000.C0270h1.m2191g(r11)
            return r3
        L1d:
            java.lang.Object r0 = r11.f7868p
            j71 r5 = r11.f7867o
            java.util.Iterator r6 = r11.f7866n
            java.lang.Object r7 = r11.f7870r
            java.util.List r7 = (java.util.List) r7
            p000.wo1.m5395v(r12)
            r10 = r7
            r7 = r5
            r5 = r10
            goto L5d
        L2e:
            p000.wo1.m5395v(r12)
            java.lang.Object r12 = r11.f7870r
            java.util.List r0 = r11.f7871s
            java.util.Iterator r0 = r0.iterator()
            java.util.ArrayList r5 = r11.f7872t
        L3b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L94
            java.lang.Object r6 = r0.next()
            j71 r6 = (p000.j71) r6
            r11.f7870r = r5
            r11.f7866n = r0
            r11.f7867o = r6
            r11.f7868p = r12
            r11.f7869q = r2
            java.lang.Object r7 = r6.m2822a(r12, r11)
            if (r7 != r4) goto L58
            goto L8f
        L58:
            r10 = r0
            r0 = r12
            r12 = r7
            r7 = r6
            r6 = r10
        L5d:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L92
            to r12 = new to
            r8 = 0
            r12.<init>(r7, r3, r8)
            r5.add(r12)
            r11.f7870r = r5
            r11.f7866n = r6
            r11.f7867o = r3
            r11.f7868p = r3
            r11.f7869q = r1
            k71 r12 = r7.f3834b
            o71 r8 = new o71
            jc1 r9 = r7.f3837e
            java.lang.Object r9 = r9.m2847a()
            android.content.SharedPreferences r9 = (android.content.SharedPreferences) r9
            java.util.LinkedHashSet r7 = r7.f3838f
            r8.<init>(r9, r7)
            java.lang.Object r12 = r12.mo928e(r8, r0, r11)
            if (r12 != r4) goto L90
        L8f:
            return r4
        L90:
            r0 = r6
            goto L3b
        L92:
            r12 = r0
            goto L90
        L94:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0773uo.mo17m(java.lang.Object):java.lang.Object");
    }
}
