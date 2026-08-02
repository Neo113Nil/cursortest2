package W5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: W5.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0491c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0491c0 f7148c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0491c0[] f7149d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0491c0[] f7150e;

    /* renamed from: a, reason: collision with root package name */
    public final int f7151a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.l0 f7152b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0491c0 EF0;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:230)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:144)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:81)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:65)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:55)
        */
    static {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W5.EnumC0491c0.<clinit>():void");
    }

    public EnumC0491c0(String str, int i7, int i8, U5.l0 l0Var) {
        this.f7151a = i8;
        String str2 = "HTTP/2 error code: " + name();
        this.f7152b = l0Var.g(l0Var.f6548b != null ? e1.k.i(t.e.d(str2, " ("), l0Var.f6548b, ")") : str2);
    }

    public static EnumC0491c0 valueOf(String str) {
        return (EnumC0491c0) Enum.valueOf(EnumC0491c0.class, str);
    }

    public static EnumC0491c0[] values() {
        return (EnumC0491c0[]) f7150e.clone();
    }
}
