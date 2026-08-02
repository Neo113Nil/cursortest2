package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public enum gu1 {
    f2912k("ADD"),
    f2914l("AND"),
    f2916m("APPLY"),
    f2918n("ASSIGN"),
    f2920o("BITWISE_AND"),
    f2922p("BITWISE_LEFT_SHIFT"),
    f2924q("BITWISE_NOT"),
    f2926r("BITWISE_OR"),
    f2928s("BITWISE_RIGHT_SHIFT"),
    f2930t("BITWISE_UNSIGNED_RIGHT_SHIFT"),
    f2932u("BITWISE_XOR"),
    f2934v("BLOCK"),
    f2936w("BREAK"),
    f2937x("CASE"),
    f2938y("CONST"),
    f2939z("CONTINUE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("CONTROL"),
    f2876A("CREATE_ARRAY"),
    f2877B("CREATE_OBJECT"),
    f2878C("DEFAULT"),
    f2879D("DEFINE_FUNCTION"),
    f2880E("DIVIDE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("DO"),
    f2881F("EQUALS"),
    f2882G("EXPRESSION_LIST"),
    f2883H("FN"),
    f2884I("FOR_IN"),
    f2885J("FOR_IN_CONST"),
    f2886K("FOR_IN_LET"),
    f2887L("FOR_LET"),
    f2888M("FOR_OF"),
    f2889N("FOR_OF_CONST"),
    f2890O("FOR_OF_LET"),
    f2891P("GET"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("GET_CONTAINER_VARIABLE"),
    f2892Q("GET_INDEX"),
    f2893R("GET_PROPERTY"),
    f2894S("GREATER_THAN"),
    f2895T("GREATER_THAN_EQUALS"),
    f2896U("IDENTITY_EQUALS"),
    f2897V("IDENTITY_NOT_EQUALS"),
    f2898W("IF"),
    f2899X("LESS_THAN"),
    f2900Y("LESS_THAN_EQUALS"),
    f2901Z("MODULUS"),
    f2902a0("MULTIPLY"),
    f2903b0("NEGATE"),
    f2904c0("NOT"),
    f2905d0("NOT_EQUALS"),
    f2906e0("NULL"),
    f2907f0("OR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("PLUS_EQUALS"),
    f2908g0("POST_DECREMENT"),
    f2909h0("POST_INCREMENT"),
    f2910i0("QUOTE"),
    f2911j0("PRE_DECREMENT"),
    f2913k0("PRE_INCREMENT"),
    f2915l0("RETURN"),
    f2917m0("SET_PROPERTY"),
    f2919n0("SUBTRACT"),
    f2921o0("SWITCH"),
    f2923p0("TERNARY"),
    f2925q0("TYPEOF"),
    f2927r0("UNDEFINED"),
    f2929s0("VAR"),
    f2931t0("WHILE");


    /* JADX INFO: renamed from: u0 */
    public static final HashMap f2933u0 = new HashMap();

    /* JADX INFO: renamed from: j */
    public final int f2940j;

    static {
        for (gu1 gu1Var : values()) {
            f2933u0.put(Integer.valueOf(gu1Var.f2940j), gu1Var);
        }
    }

    gu1(String str) {
        this.f2940j = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.valueOf(this.f2940j).toString();
    }
}
