package com.ironsource;

/* loaded from: classes5.dex */
public class F0 {
    private static final int p = -1;

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.IronSource.a f5691a;
    private final com.ironsource.F0.b b;
    private com.ironsource.E0 c;
    private final com.ironsource.AbstractC3143l3 d;
    public com.ironsource.W8 e;
    public com.ironsource.C3384yb f;
    public com.ironsource.C3067gg g;
    public com.ironsource.T1 h;
    public com.ironsource.O i;
    public com.ironsource.C3138kg j;
    public com.ironsource.Sc k;
    private java.util.Map<com.ironsource.C0, com.ironsource.F0.a> l;
    private java.util.Map<com.ironsource.C0, com.ironsource.F0.a> m;
    private java.util.Map<com.ironsource.C0, com.ironsource.F0.a> n;
    private java.util.Map<com.ironsource.C0, com.ironsource.F0.a> o;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f5692a;
        private final int b;

        public a(com.ironsource.EnumC3378y5 enumC3378y5, com.ironsource.EnumC3378y5 enumC3378y52) {
            if (enumC3378y5 != null) {
                this.f5692a = enumC3378y5.b();
            } else {
                this.f5692a = -1;
            }
            if (enumC3378y52 != null) {
                this.b = enumC3378y52.b();
            } else {
                this.b = -1;
            }
        }

        int a(com.ironsource.F0.b bVar) {
            return com.ironsource.F0.b.MEDIATION.equals(bVar) ? this.f5692a : this.b;
        }
    }

    public enum b {
        MEDIATION,
        PROVIDER
    }

    public F0(com.ironsource.mediationsdk.IronSource.a aVar, com.ironsource.F0.b bVar, com.ironsource.E0 e0) {
        this(aVar, bVar, e0, a(aVar));
    }

    private static com.ironsource.AbstractC3143l3 a(com.ironsource.mediationsdk.IronSource.a aVar) {
        return aVar.equals(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) ? com.ironsource.C3065ge.i() : com.ironsource.F9.i();
    }

    private void d() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.o = hashMap;
        hashMap.put(com.ironsource.C0.INIT_STARTED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_MANAGER_INIT_STARTED, null));
        this.o.put(com.ironsource.C0.INIT_ENDED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_MANAGER_INIT_ENDED, null));
        this.o.put(com.ironsource.C0.PLACEMENT_CAPPED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_PLACEMENT_CAPPED, null));
        this.o.put(com.ironsource.C0.AUCTION_REQUEST, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_AUCTION_REQUEST, null));
        this.o.put(com.ironsource.C0.AUCTION_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_AUCTION_SUCCESS, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map = this.o;
        com.ironsource.C0 c0 = com.ironsource.C0.AUCTION_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y5 = com.ironsource.EnumC3378y5.NT_AUCTION_FAILED;
        map.put(c0, new com.ironsource.F0.a(enumC3378y5, null));
        this.o.put(com.ironsource.C0.AUCTION_FAILED_NO_CANDIDATES, new com.ironsource.F0.a(enumC3378y5, null));
        this.o.put(com.ironsource.C0.AUCTION_REQUEST_WATERFALL, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_AUCTION_REQUEST_WATERFALL, null));
        this.o.put(com.ironsource.C0.AUCTION_RESULT_WATERFALL, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_AUCTION_RESPONSE_WATERFALL, null));
        this.o.put(com.ironsource.C0.INIT_SUCCESS, new com.ironsource.F0.a(null, null));
        this.o.put(com.ironsource.C0.INIT_FAILED, new com.ironsource.F0.a(null, null));
        this.o.put(com.ironsource.C0.AD_OPENED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_CALLBACK_SHOW, com.ironsource.EnumC3378y5.NT_INSTANCE_SHOW));
        this.o.put(com.ironsource.C0.AD_CLICKED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_CALLBACK_CLICK, com.ironsource.EnumC3378y5.NT_INSTANCE_CLICK));
        this.o.put(com.ironsource.C0.LOAD_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_LOAD, com.ironsource.EnumC3378y5.NT_INSTANCE_LOAD));
        this.o.put(com.ironsource.C0.LOAD_AD_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_CALLBACK_LOAD_SUCCESS, com.ironsource.EnumC3378y5.NT_INSTANCE_LOAD_SUCCESS));
        this.o.put(com.ironsource.C0.LOAD_AD_FAILED_WITH_REASON, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_CALLBACK_LOAD_ERROR, com.ironsource.EnumC3378y5.NT_INSTANCE_LOAD_ERROR));
        this.o.put(com.ironsource.C0.LOAD_AD_NO_FILL, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.NT_INSTANCE_LOAD_NO_FILL));
        this.o.put(com.ironsource.C0.AD_FORMAT_CAPPED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_AD_UNIT_CAPPED, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map2 = this.o;
        com.ironsource.C0 c02 = com.ironsource.C0.COLLECT_TOKEN;
        com.ironsource.EnumC3378y5 enumC3378y52 = com.ironsource.EnumC3378y5.NT_COLLECT_TOKENS;
        com.ironsource.EnumC3378y5 enumC3378y53 = com.ironsource.EnumC3378y5.NT_INSTANCE_COLLECT_TOKEN;
        map2.put(c02, new com.ironsource.F0.a(enumC3378y52, enumC3378y53));
        this.o.put(com.ironsource.C0.COLLECT_TOKENS_COMPLETED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_COLLECT_TOKENS_COMPLETED, null));
        this.o.put(com.ironsource.C0.COLLECT_TOKENS_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_COLLECT_TOKENS_FAILED, null));
        this.o.put(com.ironsource.C0.INSTANCE_COLLECT_TOKEN, new com.ironsource.F0.a(enumC3378y53, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map3 = this.o;
        com.ironsource.C0 c03 = com.ironsource.C0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y54 = com.ironsource.EnumC3378y5.NT_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map3.put(c03, new com.ironsource.F0.a(enumC3378y54, enumC3378y54));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map4 = this.o;
        com.ironsource.C0 c04 = com.ironsource.C0.INSTANCE_COLLECT_TOKEN_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y55 = com.ironsource.EnumC3378y5.NT_INSTANCE_COLLECT_TOKEN_FAILED;
        map4.put(c04, new com.ironsource.F0.a(enumC3378y55, enumC3378y55));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map5 = this.o;
        com.ironsource.C0 c05 = com.ironsource.C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        com.ironsource.EnumC3378y5 enumC3378y56 = com.ironsource.EnumC3378y5.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map5.put(c05, new com.ironsource.F0.a(enumC3378y56, enumC3378y56));
        this.o.put(com.ironsource.C0.DESTROY_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.NT_DESTROY, com.ironsource.EnumC3378y5.NT_INSTANCE_DESTROY));
        this.o.put(com.ironsource.C0.TROUBLESHOOT_ILR_REVENUE, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_ILR_REVENUE, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map6 = this.o;
        com.ironsource.C0 c06 = com.ironsource.C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        com.ironsource.EnumC3378y5 enumC3378y57 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING;
        map6.put(c06, new com.ironsource.F0.a(enumC3378y57, enumC3378y57));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map7 = this.o;
        com.ironsource.C0 c07 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y58 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS;
        map7.put(c07, new com.ironsource.F0.a(enumC3378y58, enumC3378y58));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map8 = this.o;
        com.ironsource.C0 c08 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y59 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED;
        map8.put(c08, new com.ironsource.F0.a(enumC3378y59, enumC3378y59));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map9 = this.o;
        com.ironsource.C0 c09 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y510 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS;
        map9.put(c09, new com.ironsource.F0.a(enumC3378y510, enumC3378y510));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map10 = this.o;
        com.ironsource.C0 c010 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y511 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED;
        map10.put(c010, new com.ironsource.F0.a(enumC3378y511, enumC3378y511));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map11 = this.o;
        com.ironsource.C0 c011 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y512 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS;
        map11.put(c011, new com.ironsource.F0.a(enumC3378y512, enumC3378y512));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map12 = this.o;
        com.ironsource.C0 c012 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y513 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED;
        map12.put(c012, new com.ironsource.F0.a(enumC3378y513, enumC3378y513));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map13 = this.o;
        com.ironsource.C0 c013 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        com.ironsource.EnumC3378y5 enumC3378y514 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT;
        map13.put(c013, new com.ironsource.F0.a(enumC3378y514, enumC3378y514));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map14 = this.o;
        com.ironsource.C0 c014 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_OPENED;
        com.ironsource.EnumC3378y5 enumC3378y515 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_UNEXPECTED_OPENED;
        map14.put(c014, new com.ironsource.F0.a(enumC3378y515, enumC3378y515));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map15 = this.o;
        com.ironsource.C0 c015 = com.ironsource.C0.TROUBLESHOOT_INTERNAL_ERROR;
        com.ironsource.EnumC3378y5 enumC3378y516 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_INTERNAL_ERROR;
        map15.put(c015, new com.ironsource.F0.a(enumC3378y516, enumC3378y516));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map16 = this.o;
        com.ironsource.C0 c016 = com.ironsource.C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        com.ironsource.EnumC3378y5 enumC3378y517 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map16.put(c016, new com.ironsource.F0.a(enumC3378y517, enumC3378y517));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map17 = this.o;
        com.ironsource.C0 c017 = com.ironsource.C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        com.ironsource.EnumC3378y5 enumC3378y518 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map17.put(c017, new com.ironsource.F0.a(enumC3378y518, enumC3378y518));
        this.o.put(com.ironsource.C0.TROUBLESHOOT_NOTIFICATION_ERROR, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, null));
    }

    void b() {
        c();
        e();
        a();
        d();
    }

    void c() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.l = hashMap;
        hashMap.put(com.ironsource.C0.INIT_STARTED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_MANAGER_INIT_STARTED, null));
        this.l.put(com.ironsource.C0.INIT_ENDED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_MANAGER_INIT_ENDED, null));
        this.l.put(com.ironsource.C0.SESSION_CAPPED, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.IS_CAP_SESSION));
        this.l.put(com.ironsource.C0.PLACEMENT_CAPPED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_CAP_PLACEMENT, null));
        this.l.put(com.ironsource.C0.CHECK_PLACEMENT_CAPPED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_CHECK_PLACEMENT_CAPPED, null));
        this.l.put(com.ironsource.C0.AUCTION_REQUEST, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_AUCTION_REQUEST, null));
        this.l.put(com.ironsource.C0.AUCTION_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_AUCTION_SUCCESS, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map = this.l;
        com.ironsource.C0 c0 = com.ironsource.C0.AUCTION_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y5 = com.ironsource.EnumC3378y5.IS_AUCTION_FAILED;
        map.put(c0, new com.ironsource.F0.a(enumC3378y5, null));
        this.l.put(com.ironsource.C0.AUCTION_FAILED_NO_CANDIDATES, new com.ironsource.F0.a(enumC3378y5, null));
        this.l.put(com.ironsource.C0.AUCTION_REQUEST_WATERFALL, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_AUCTION_REQUEST_WATERFALL, null));
        this.l.put(com.ironsource.C0.AUCTION_RESULT_WATERFALL, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_RESULT_WATERFALL, null));
        this.l.put(com.ironsource.C0.INIT_SUCCESS, new com.ironsource.F0.a(null, null));
        this.l.put(com.ironsource.C0.INIT_FAILED, new com.ironsource.F0.a(null, null));
        this.l.put(com.ironsource.C0.AD_OPENED, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.IS_INSTANCE_OPENED));
        this.l.put(com.ironsource.C0.AD_CLOSED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_CALLBACK_AD_CLOSED, com.ironsource.EnumC3378y5.IS_INSTANCE_CLOSED));
        this.l.put(com.ironsource.C0.AD_CLICKED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_CALLBACK_AD_CLICKED, com.ironsource.EnumC3378y5.IS_INSTANCE_CLICKED));
        this.l.put(com.ironsource.C0.AD_INFO_CHANGED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_CALLBACK_AD_INFO_CHANGED, null));
        this.l.put(com.ironsource.C0.LOAD_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_LOAD_CALLED, com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD));
        this.l.put(com.ironsource.C0.LOAD_AD_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_CALLBACK_LOAD_SUCCESS, com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD_SUCCESS));
        this.l.put(com.ironsource.C0.LOAD_AD_FAILED_WITH_REASON, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_CALLBACK_LOAD_ERROR, com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD_FAILED));
        this.l.put(com.ironsource.C0.LOAD_AD_NO_FILL, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.IS_INSTANCE_LOAD_NO_FILL));
        this.l.put(com.ironsource.C0.SHOW_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_SHOW_CALLED, com.ironsource.EnumC3378y5.IS_INSTANCE_SHOW));
        this.l.put(com.ironsource.C0.SHOW_AD_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_CALLBACK_AD_SHOW_ERROR, com.ironsource.EnumC3378y5.IS_INSTANCE_SHOW_FAILED));
        this.l.put(com.ironsource.C0.AD_FORMAT_CAPPED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_AD_FORMAT_CAPPED, null));
        this.l.put(com.ironsource.C0.AD_UNIT_CAPPED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_AD_UNIT_CAPPED, null));
        this.l.put(com.ironsource.C0.COLLECT_TOKEN, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_COLLECT_TOKENS, null));
        this.l.put(com.ironsource.C0.COLLECT_TOKENS_COMPLETED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_COLLECT_TOKENS_COMPLETED, null));
        this.l.put(com.ironsource.C0.COLLECT_TOKENS_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_COLLECT_TOKENS_FAILED, null));
        this.l.put(com.ironsource.C0.INSTANCE_COLLECT_TOKEN, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_INSTANCE_COLLECT_TOKEN, null));
        this.l.put(com.ironsource.C0.INSTANCE_COLLECT_TOKEN_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, null));
        this.l.put(com.ironsource.C0.INSTANCE_COLLECT_TOKEN_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_INSTANCE_COLLECT_TOKEN_FAILED, null));
        this.l.put(com.ironsource.C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, null));
        this.l.put(com.ironsource.C0.AD_READY_TRUE, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_CHECK_READY_TRUE, null));
        this.l.put(com.ironsource.C0.AD_READY_FALSE, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_CHECK_READY_FALSE, null));
        this.l.put(com.ironsource.C0.OPERATIONAL_LOAD_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_OPERATIONAL_LOAD_AD, null));
        this.l.put(com.ironsource.C0.OPERATIONAL_LOAD_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_OPERATIONAL_LOAD_SUCCESS, null));
        this.l.put(com.ironsource.C0.OPERATIONAL_LOAD_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_OPERATIONAL_LOAD_FAILED, null));
        this.l.put(com.ironsource.C0.OPERATIONAL_SET_CONFIGURATIONS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_SET_CONFIGURATION, null));
        this.l.put(com.ironsource.C0.PRELOAD_ADUNIT_INITIATED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_PRELOAD_ADUNIT_INITIATED, null));
        this.l.put(com.ironsource.C0.PRELOAD_ADUNIT_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_PRELOAD_ADUNIT_FAILED, null));
        this.l.put(com.ironsource.C0.PRELOAD_ADUNIT_LOAD_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.IS_PRELOAD_ADUNIT_LOAD_SUCCESS, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map2 = this.l;
        com.ironsource.C0 c02 = com.ironsource.C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        com.ironsource.EnumC3378y5 enumC3378y52 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING;
        map2.put(c02, new com.ironsource.F0.a(enumC3378y52, enumC3378y52));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map3 = this.l;
        com.ironsource.C0 c03 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y53 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS;
        map3.put(c03, new com.ironsource.F0.a(enumC3378y53, enumC3378y53));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map4 = this.l;
        com.ironsource.C0 c04 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y54 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED;
        map4.put(c04, new com.ironsource.F0.a(enumC3378y54, enumC3378y54));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map5 = this.l;
        com.ironsource.C0 c05 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y55 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS;
        map5.put(c05, new com.ironsource.F0.a(enumC3378y55, enumC3378y55));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map6 = this.l;
        com.ironsource.C0 c06 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y56 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED;
        map6.put(c06, new com.ironsource.F0.a(enumC3378y56, enumC3378y56));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map7 = this.l;
        com.ironsource.C0 c07 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y57 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS;
        map7.put(c07, new com.ironsource.F0.a(enumC3378y57, enumC3378y57));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map8 = this.l;
        com.ironsource.C0 c08 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y58 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED;
        map8.put(c08, new com.ironsource.F0.a(enumC3378y58, enumC3378y58));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map9 = this.l;
        com.ironsource.C0 c09 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y59 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED;
        map9.put(c09, new com.ironsource.F0.a(enumC3378y59, enumC3378y59));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map10 = this.l;
        com.ironsource.C0 c010 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        com.ironsource.EnumC3378y5 enumC3378y510 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED;
        map10.put(c010, new com.ironsource.F0.a(enumC3378y510, enumC3378y510));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map11 = this.l;
        com.ironsource.C0 c011 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        com.ironsource.EnumC3378y5 enumC3378y511 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT;
        map11.put(c011, new com.ironsource.F0.a(enumC3378y511, enumC3378y511));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map12 = this.l;
        com.ironsource.C0 c012 = com.ironsource.C0.TROUBLESHOOT_INTERNAL_ERROR;
        com.ironsource.EnumC3378y5 enumC3378y512 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_INTERNAL_ERROR;
        map12.put(c012, new com.ironsource.F0.a(enumC3378y512, enumC3378y512));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map13 = this.l;
        com.ironsource.C0 c013 = com.ironsource.C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        com.ironsource.EnumC3378y5 enumC3378y513 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map13.put(c013, new com.ironsource.F0.a(enumC3378y513, enumC3378y513));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map14 = this.l;
        com.ironsource.C0 c014 = com.ironsource.C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        com.ironsource.EnumC3378y5 enumC3378y514 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map14.put(c014, new com.ironsource.F0.a(enumC3378y514, enumC3378y514));
        this.l.put(com.ironsource.C0.TROUBLESHOOT_NOTIFICATION_ERROR, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map15 = this.l;
        com.ironsource.C0 c015 = com.ironsource.C0.TROUBLESHOOT_AD_EXPIRED;
        com.ironsource.EnumC3378y5 enumC3378y515 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_AD_EXPIRED;
        map15.put(c015, new com.ironsource.F0.a(enumC3378y515, enumC3378y515));
        this.l.put(com.ironsource.C0.TROUBLESHOOT_LOAD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_LOAD, null));
        this.l.put(com.ironsource.C0.TROUBLESHOOT_LOAD_WHILE_LOADED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, null));
        this.l.put(com.ironsource.C0.TROUBLESHOOT_LOAD_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_LOAD_SUCCESS, null));
        this.l.put(com.ironsource.C0.TROUBLESHOOT_LOAD_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_LOAD_FAILED, null));
        this.l.put(com.ironsource.C0.TROUBLESHOOT_SHOW, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_SHOW, null));
        this.l.put(com.ironsource.C0.TROUBLESHOOT_SHOW_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_SHOW_SUCCESS, null));
        this.l.put(com.ironsource.C0.TROUBLESHOOT_SHOW_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_SHOW_FAILED, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map16 = this.l;
        com.ironsource.C0 c016 = com.ironsource.C0.TROUBLESHOOT_ILLEGAL_STATE;
        com.ironsource.EnumC3378y5 enumC3378y516 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_ILLEGAL_STATE;
        map16.put(c016, new com.ironsource.F0.a(enumC3378y516, enumC3378y516));
        this.l.put(com.ironsource.C0.TROUBLESHOOT_AD_INFO_CHANGED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOT_IS_AD_INFO_CHANGED, null));
        this.l.put(com.ironsource.C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.l.put(com.ironsource.C0.TROUBLESHOOT_ILR_REVENUE, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_ILR_REVENUE, null));
        this.l.put(com.ironsource.C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOT_IS_SHOW_RECOVERY_INITIATED, null));
    }

    void e() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.m = hashMap;
        hashMap.put(com.ironsource.C0.INIT_STARTED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_MANAGER_INIT_STARTED, null));
        this.m.put(com.ironsource.C0.INIT_ENDED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_MANAGER_INIT_ENDED, null));
        this.m.put(com.ironsource.C0.SESSION_CAPPED, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.RV_CAP_SESSION));
        this.m.put(com.ironsource.C0.PLACEMENT_CAPPED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_CAP_PLACEMENT, null));
        this.m.put(com.ironsource.C0.CHECK_PLACEMENT_CAPPED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_CHECK_PLACEMENT_CAPPED, null));
        this.m.put(com.ironsource.C0.AUCTION_REQUEST, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_AUCTION_REQUEST, null));
        this.m.put(com.ironsource.C0.AUCTION_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_AUCTION_SUCCESS, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map = this.m;
        com.ironsource.C0 c0 = com.ironsource.C0.AUCTION_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y5 = com.ironsource.EnumC3378y5.RV_AUCTION_FAILED;
        map.put(c0, new com.ironsource.F0.a(enumC3378y5, null));
        this.m.put(com.ironsource.C0.AUCTION_FAILED_NO_CANDIDATES, new com.ironsource.F0.a(enumC3378y5, null));
        this.m.put(com.ironsource.C0.AUCTION_REQUEST_WATERFALL, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_AUCTION_REQUEST_WATERFALL, null));
        this.m.put(com.ironsource.C0.AUCTION_RESULT_WATERFALL, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_AUCTION_RESPONSE_WATERFALL, null));
        this.m.put(com.ironsource.C0.INIT_SUCCESS, new com.ironsource.F0.a(null, null));
        this.m.put(com.ironsource.C0.INIT_FAILED, new com.ironsource.F0.a(null, null));
        this.m.put(com.ironsource.C0.AD_VISIBLE, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.RV_INSTANCE_VISIBLE));
        this.m.put(com.ironsource.C0.AD_OPENED, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_OPENED));
        this.m.put(com.ironsource.C0.AD_CLOSED, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.RV_INSTANCE_CLOSED));
        this.m.put(com.ironsource.C0.AD_STARTED, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.RV_INSTANCE_STARTED));
        this.m.put(com.ironsource.C0.AD_ENDED, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.RV_INSTANCE_ENDED));
        this.m.put(com.ironsource.C0.AD_CLICKED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_CALLBACK_AD_CLICKED, com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_CLICKED));
        this.m.put(com.ironsource.C0.AD_INFO_CHANGED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_CALLBACK_AD_INFO_CHANGED, null));
        this.m.put(com.ironsource.C0.AD_REWARDED, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_REWARDED));
        this.m.put(com.ironsource.C0.AD_AVAILABILITY_CHANGED_TRUE, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_CALLBACK_AVAILABILITY_TRUE, com.ironsource.EnumC3378y5.RV_INSTANCE_AVAILABILITY_TRUE));
        this.m.put(com.ironsource.C0.AD_AVAILABILITY_CHANGED_FALSE, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_CALLBACK_AVAILABILITY_FALSE, com.ironsource.EnumC3378y5.RV_INSTANCE_AVAILABILITY_FALSE));
        this.m.put(com.ironsource.C0.LOAD_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_BUSINESS_MEDIATION_LOAD, com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_LOAD));
        this.m.put(com.ironsource.C0.LOAD_AD_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS, com.ironsource.EnumC3378y5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS));
        this.m.put(com.ironsource.C0.LOAD_AD_FAILED, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.RV_INSTANCE_LOAD_FAILED));
        this.m.put(com.ironsource.C0.LOAD_AD_FAILED_WITH_REASON, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_MEDIATION_LOAD_ERROR, com.ironsource.EnumC3378y5.RV_INSTANCE_LOAD_FAILED_REASON));
        this.m.put(com.ironsource.C0.LOAD_AD_NO_FILL, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.RV_INSTANCE_LOAD_NO_FILL));
        this.m.put(com.ironsource.C0.SHOW_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_API_SHOW_CALLED, com.ironsource.EnumC3378y5.RV_INSTANCE_SHOW));
        this.m.put(com.ironsource.C0.SHOW_AD_CHANCE, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.RV_INSTANCE_SHOW_CHANCE));
        this.m.put(com.ironsource.C0.SHOW_AD_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_CALLBACK_SHOW_FAILED, com.ironsource.EnumC3378y5.RV_INSTANCE_SHOW_FAILED));
        this.m.put(com.ironsource.C0.AD_FORMAT_CAPPED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_AD_UNIT_CAPPED, null));
        this.m.put(com.ironsource.C0.COLLECT_TOKEN, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_COLLECT_TOKENS, null));
        this.m.put(com.ironsource.C0.COLLECT_TOKENS_COMPLETED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_COLLECT_TOKENS_COMPLETED, null));
        this.m.put(com.ironsource.C0.COLLECT_TOKENS_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_COLLECT_TOKENS_FAILED, null));
        this.m.put(com.ironsource.C0.INSTANCE_COLLECT_TOKEN, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_INSTANCE_COLLECT_TOKEN, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map2 = this.m;
        com.ironsource.C0 c02 = com.ironsource.C0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y52 = com.ironsource.EnumC3378y5.RV_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map2.put(c02, new com.ironsource.F0.a(enumC3378y52, enumC3378y52));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map3 = this.m;
        com.ironsource.C0 c03 = com.ironsource.C0.INSTANCE_COLLECT_TOKEN_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y53 = com.ironsource.EnumC3378y5.RV_INSTANCE_COLLECT_TOKEN_FAILED;
        map3.put(c03, new com.ironsource.F0.a(enumC3378y53, enumC3378y53));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map4 = this.m;
        com.ironsource.C0 c04 = com.ironsource.C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        com.ironsource.EnumC3378y5 enumC3378y54 = com.ironsource.EnumC3378y5.RV_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map4.put(c04, new com.ironsource.F0.a(enumC3378y54, enumC3378y54));
        this.m.put(com.ironsource.C0.AD_READY_TRUE, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_CHECK_READY_TRUE, null));
        this.m.put(com.ironsource.C0.AD_READY_FALSE, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_CHECK_READY_FALSE, null));
        this.m.put(com.ironsource.C0.OPERATIONAL_LOAD_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_OPERATIONAL_LOAD_AD, null));
        this.m.put(com.ironsource.C0.OPERATIONAL_LOAD_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_OPERATIONAL_LOAD_SUCCESS, null));
        this.m.put(com.ironsource.C0.OPERATIONAL_LOAD_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_OPERATIONAL_LOAD_FAILED, null));
        this.m.put(com.ironsource.C0.OPERATIONAL_SET_CONFIGURATIONS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_SET_CONFIGURATION, null));
        this.m.put(com.ironsource.C0.OPERATIONAL_GET_REWARD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_OPERATIONAL_GET_REWARD, null));
        this.m.put(com.ironsource.C0.PRELOAD_ADUNIT_INITIATED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_PRELOAD_ADUNIT_INITIATED, null));
        this.m.put(com.ironsource.C0.PRELOAD_ADUNIT_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_PRELOAD_ADUNIT_FAILED, null));
        this.m.put(com.ironsource.C0.PRELOAD_ADUNIT_LOAD_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.RV_PRELOAD_ADUNIT_LOAD_SUCCESS, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map5 = this.m;
        com.ironsource.C0 c05 = com.ironsource.C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        com.ironsource.EnumC3378y5 enumC3378y55 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING;
        map5.put(c05, new com.ironsource.F0.a(enumC3378y55, enumC3378y55));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map6 = this.m;
        com.ironsource.C0 c06 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y56 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS;
        map6.put(c06, new com.ironsource.F0.a(enumC3378y56, enumC3378y56));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map7 = this.m;
        com.ironsource.C0 c07 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y57 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED;
        map7.put(c07, new com.ironsource.F0.a(enumC3378y57, enumC3378y57));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map8 = this.m;
        com.ironsource.C0 c08 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y58 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS;
        map8.put(c08, new com.ironsource.F0.a(enumC3378y58, enumC3378y58));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map9 = this.m;
        com.ironsource.C0 c09 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y59 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED;
        map9.put(c09, new com.ironsource.F0.a(enumC3378y59, enumC3378y59));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map10 = this.m;
        com.ironsource.C0 c010 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y510 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS;
        map10.put(c010, new com.ironsource.F0.a(enumC3378y510, enumC3378y510));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map11 = this.m;
        com.ironsource.C0 c011 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y511 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED;
        map11.put(c011, new com.ironsource.F0.a(enumC3378y511, enumC3378y511));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map12 = this.m;
        com.ironsource.C0 c012 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y512 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED;
        map12.put(c012, new com.ironsource.F0.a(enumC3378y512, enumC3378y512));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map13 = this.m;
        com.ironsource.C0 c013 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        com.ironsource.EnumC3378y5 enumC3378y513 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT;
        map13.put(c013, new com.ironsource.F0.a(enumC3378y513, enumC3378y513));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map14 = this.m;
        com.ironsource.C0 c014 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_CLOSED;
        com.ironsource.EnumC3378y5 enumC3378y514 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED;
        map14.put(c014, new com.ironsource.F0.a(enumC3378y514, enumC3378y514));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map15 = this.m;
        com.ironsource.C0 c015 = com.ironsource.C0.TROUBLESHOOT_LOAD_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y515 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_LOAD_FAILED;
        map15.put(c015, new com.ironsource.F0.a(enumC3378y515, enumC3378y515));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map16 = this.m;
        com.ironsource.C0 c016 = com.ironsource.C0.TROUBLESHOOT_INTERNAL_ERROR;
        com.ironsource.EnumC3378y5 enumC3378y516 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_INTERNAL_ERROR;
        map16.put(c016, new com.ironsource.F0.a(enumC3378y516, enumC3378y516));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map17 = this.m;
        com.ironsource.C0 c017 = com.ironsource.C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        com.ironsource.EnumC3378y5 enumC3378y517 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(c017, new com.ironsource.F0.a(enumC3378y517, enumC3378y517));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map18 = this.m;
        com.ironsource.C0 c018 = com.ironsource.C0.TROUBLESHOOT_WATERFALL_OVERHEAD;
        com.ironsource.EnumC3378y5 enumC3378y518 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD;
        map18.put(c018, new com.ironsource.F0.a(enumC3378y518, enumC3378y518));
        this.m.put(com.ironsource.C0.TROUBLESHOOT_NOTIFICATION_ERROR, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map19 = this.m;
        com.ironsource.C0 c019 = com.ironsource.C0.TROUBLESHOOT_AD_EXPIRED;
        com.ironsource.EnumC3378y5 enumC3378y519 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_AD_EXPIRED;
        map19.put(c019, new com.ironsource.F0.a(enumC3378y519, enumC3378y519));
        this.m.put(com.ironsource.C0.TROUBLESHOOT_LOAD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_LOAD, null));
        this.m.put(com.ironsource.C0.TROUBLESHOOT_LOAD_WHILE_LOADED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, null));
        this.m.put(com.ironsource.C0.TROUBLESHOOT_LOAD_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_LOAD_SUCCESS, null));
        this.m.put(com.ironsource.C0.TROUBLESHOOT_SHOW, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_SHOW, null));
        this.m.put(com.ironsource.C0.TROUBLESHOOT_SHOW_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_SHOW_SUCCESS, null));
        this.m.put(com.ironsource.C0.TROUBLESHOOT_SHOW_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_SHOW_FAILED, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map20 = this.m;
        com.ironsource.C0 c020 = com.ironsource.C0.TROUBLESHOOT_ILLEGAL_STATE;
        com.ironsource.EnumC3378y5 enumC3378y520 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_ILLEGAL_STATE;
        map20.put(c020, new com.ironsource.F0.a(enumC3378y520, enumC3378y520));
        this.m.put(com.ironsource.C0.TROUBLESHOOT_AD_INFO_CHANGED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOT_RV_AD_INFO_CHANGED, null));
        this.m.put(com.ironsource.C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_DESTROY_READY_TO_SHOW_INSTANCES, null));
        this.m.put(com.ironsource.C0.TROUBLESHOOT_ILR_REVENUE, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_RV_ILR_REVENUE, null));
        this.m.put(com.ironsource.C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOT_RV_SHOW_RECOVERY_INITIATED, null));
    }

    public void f() {
        this.c = null;
        this.g = null;
        this.h = null;
        this.e = null;
        this.f = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }

    public F0(com.ironsource.mediationsdk.IronSource.a aVar, com.ironsource.F0.b bVar, com.ironsource.E0 e0, com.ironsource.AbstractC3143l3 abstractC3143l3) {
        this.f5691a = aVar;
        this.b = bVar;
        this.c = e0;
        this.d = abstractC3143l3 == null ? a(aVar) : abstractC3143l3;
        b();
        this.e = new com.ironsource.W8(this);
        this.f = new com.ironsource.C3384yb(this);
        this.g = new com.ironsource.C3067gg(this);
        this.h = new com.ironsource.T1(this);
        this.i = new com.ironsource.O(this);
        this.j = new com.ironsource.C3138kg(this);
        this.k = new com.ironsource.Sc(this);
    }

    protected void a(com.ironsource.C0 c0, java.util.Map<java.lang.String, java.lang.Object> map) {
        a(c0, map, java.util.Calendar.getInstance().getTimeInMillis());
    }

    public void a(com.ironsource.C0 c0, java.util.Map<java.lang.String, java.lang.Object> map, long j) {
        int a2 = a(c0);
        if (-1 == a2) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        com.ironsource.E0 e0 = this.c;
        if (e0 != null) {
            hashMap.putAll(e0.a(c0));
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.d.a(new com.ironsource.C3360x5(a2, j, new org.json.JSONObject(hashMap)));
    }

    private int a(com.ironsource.C0 c0) {
        try {
            if (com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL.equals(this.f5691a) && this.l.containsKey(c0)) {
                return this.l.get(c0).a(this.b);
            }
            if (com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO.equals(this.f5691a) && this.m.containsKey(c0)) {
                return this.m.get(c0).a(this.b);
            }
            if (com.ironsource.mediationsdk.IronSource.a.BANNER.equals(this.f5691a) && this.n.containsKey(c0)) {
                return this.n.get(c0).a(this.b);
            }
            if (com.ironsource.mediationsdk.IronSource.a.NATIVE_AD.equals(this.f5691a) && this.o.containsKey(c0)) {
                return this.o.get(c0).a(this.b);
            }
            return -1;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    void a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.n = hashMap;
        hashMap.put(com.ironsource.C0.INIT_STARTED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_MANAGER_INIT_STARTED, null));
        this.n.put(com.ironsource.C0.INIT_ENDED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_MANAGER_INIT_ENDED, null));
        this.n.put(com.ironsource.C0.PLACEMENT_CAPPED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_PLACEMENT_CAPPED, null));
        this.n.put(com.ironsource.C0.AUCTION_REQUEST, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_AUCTION_REQUEST, null));
        this.n.put(com.ironsource.C0.AUCTION_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_AUCTION_SUCCESS, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map = this.n;
        com.ironsource.C0 c0 = com.ironsource.C0.AUCTION_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y5 = com.ironsource.EnumC3378y5.BN_AUCTION_FAILED;
        map.put(c0, new com.ironsource.F0.a(enumC3378y5, null));
        this.n.put(com.ironsource.C0.AUCTION_FAILED_NO_CANDIDATES, new com.ironsource.F0.a(enumC3378y5, null));
        this.n.put(com.ironsource.C0.AUCTION_REQUEST_WATERFALL, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_AUCTION_REQUEST_WATERFALL, null));
        this.n.put(com.ironsource.C0.AUCTION_RESULT_WATERFALL, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_AUCTION_RESPONSE_WATERFALL, null));
        this.n.put(com.ironsource.C0.INIT_SUCCESS, new com.ironsource.F0.a(null, null));
        this.n.put(com.ironsource.C0.INIT_FAILED, new com.ironsource.F0.a(null, null));
        this.n.put(com.ironsource.C0.AD_OPENED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_CALLBACK_SHOW, com.ironsource.EnumC3378y5.BN_INSTANCE_SHOW));
        this.n.put(com.ironsource.C0.SHOW_AD_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_CALLBACK_SHOW_FAILED, com.ironsource.EnumC3378y5.BN_INSTANCE_SHOW_FAILED));
        this.n.put(com.ironsource.C0.AD_CLICKED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_CALLBACK_CLICK, com.ironsource.EnumC3378y5.BN_INSTANCE_CLICK));
        this.n.put(com.ironsource.C0.LOAD_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_LOAD, com.ironsource.EnumC3378y5.BN_INSTANCE_LOAD));
        this.n.put(com.ironsource.C0.RELOAD_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_RELOAD, com.ironsource.EnumC3378y5.BN_INSTANCE_RELOAD));
        this.n.put(com.ironsource.C0.LOAD_AD_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_CALLBACK_LOAD_SUCCESS, com.ironsource.EnumC3378y5.BN_INSTANCE_LOAD_SUCCESS));
        this.n.put(com.ironsource.C0.RELOAD_AD_SUCCESS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_CALLBACK_RELOAD_SUCCESS, com.ironsource.EnumC3378y5.BN_INSTANCE_RELOAD_SUCCESS));
        this.n.put(com.ironsource.C0.LOAD_AD_FAILED_WITH_REASON, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_CALLBACK_LOAD_ERROR, com.ironsource.EnumC3378y5.BN_INSTANCE_LOAD_ERROR));
        this.n.put(com.ironsource.C0.RELOAD_AD_FAILED_WITH_REASON, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_CALLBACK_RELOAD_ERROR, com.ironsource.EnumC3378y5.BN_INSTANCE_RELOAD_ERROR));
        this.n.put(com.ironsource.C0.LOAD_AD_NO_FILL, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.BN_INSTANCE_LOAD_NO_FILL));
        this.n.put(com.ironsource.C0.RELOAD_AD_NO_FILL, new com.ironsource.F0.a(null, com.ironsource.EnumC3378y5.BN_INSTANCE_RELOAD_NO_FILL));
        this.n.put(com.ironsource.C0.AD_FORMAT_CAPPED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_AD_UNIT_CAPPED, null));
        this.n.put(com.ironsource.C0.COLLECT_TOKEN, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_COLLECT_TOKENS, null));
        this.n.put(com.ironsource.C0.COLLECT_TOKENS_COMPLETED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_COLLECT_TOKENS_COMPLETED, null));
        this.n.put(com.ironsource.C0.COLLECT_TOKENS_FAILED, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_COLLECT_TOKENS_FAILED, null));
        this.n.put(com.ironsource.C0.INSTANCE_COLLECT_TOKEN, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_INSTANCE_COLLECT_TOKEN, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map2 = this.n;
        com.ironsource.C0 c02 = com.ironsource.C0.INSTANCE_COLLECT_TOKEN_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y52 = com.ironsource.EnumC3378y5.BN_INSTANCE_COLLECT_TOKEN_SUCCESS;
        map2.put(c02, new com.ironsource.F0.a(enumC3378y52, enumC3378y52));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map3 = this.n;
        com.ironsource.C0 c03 = com.ironsource.C0.INSTANCE_COLLECT_TOKEN_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y53 = com.ironsource.EnumC3378y5.BN_INSTANCE_COLLECT_TOKEN_FAILED;
        map3.put(c03, new com.ironsource.F0.a(enumC3378y53, enumC3378y53));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map4 = this.n;
        com.ironsource.C0 c04 = com.ironsource.C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        com.ironsource.EnumC3378y5 enumC3378y54 = com.ironsource.EnumC3378y5.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT;
        map4.put(c04, new com.ironsource.F0.a(enumC3378y54, enumC3378y54));
        this.n.put(com.ironsource.C0.DESTROY_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_DESTROY, com.ironsource.EnumC3378y5.BN_INSTANCE_DESTROY));
        this.n.put(com.ironsource.C0.SKIP_RELOAD_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_SKIP_RELOAD, null));
        this.n.put(com.ironsource.C0.AD_LEFT_APPLICATION, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_CALLBACK_LEAVE_APP, com.ironsource.EnumC3378y5.BN_INSTANCE_LEAVE_APP));
        this.n.put(com.ironsource.C0.AD_PRESENT_SCREEN, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_CALLBACK_PRESENT_SCREEN, com.ironsource.EnumC3378y5.BN_INSTANCE_PRESENT_SCREEN));
        this.n.put(com.ironsource.C0.AD_DISMISS_SCREEN, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_CALLBACK_DISMISS_SCREEN, com.ironsource.EnumC3378y5.BN_INSTANCE_DISMISS_SCREEN));
        this.n.put(com.ironsource.C0.AD_VIEW_BOUND, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_BOUND, com.ironsource.EnumC3378y5.BN_INSTANCE_BOUND));
        this.n.put(com.ironsource.C0.PAUSE_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_REFRESH_PAUSE, null));
        this.n.put(com.ironsource.C0.RESUME_AD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_REFRESH_RESUME, null));
        this.n.put(com.ironsource.C0.OPERATIONAL_SET_CONFIGURATIONS, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.BN_SET_CONFIGURATION, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map5 = this.n;
        com.ironsource.C0 c05 = com.ironsource.C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING;
        com.ironsource.EnumC3378y5 enumC3378y55 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING;
        map5.put(c05, new com.ironsource.F0.a(enumC3378y55, enumC3378y55));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map6 = this.n;
        com.ironsource.C0 c06 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y56 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS;
        map6.put(c06, new com.ironsource.F0.a(enumC3378y56, enumC3378y56));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map7 = this.n;
        com.ironsource.C0 c07 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y57 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED;
        map7.put(c07, new com.ironsource.F0.a(enumC3378y57, enumC3378y57));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map8 = this.n;
        com.ironsource.C0 c08 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y58 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS;
        map8.put(c08, new com.ironsource.F0.a(enumC3378y58, enumC3378y58));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map9 = this.n;
        com.ironsource.C0 c09 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y59 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED;
        map9.put(c09, new com.ironsource.F0.a(enumC3378y59, enumC3378y59));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map10 = this.n;
        com.ironsource.C0 c010 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y510 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS;
        map10.put(c010, new com.ironsource.F0.a(enumC3378y510, enumC3378y510));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map11 = this.n;
        com.ironsource.C0 c011 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y511 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED;
        map11.put(c011, new com.ironsource.F0.a(enumC3378y511, enumC3378y511));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map12 = this.n;
        com.ironsource.C0 c012 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS;
        com.ironsource.EnumC3378y5 enumC3378y512 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS;
        map12.put(c012, new com.ironsource.F0.a(enumC3378y512, enumC3378y512));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map13 = this.n;
        com.ironsource.C0 c013 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED;
        com.ironsource.EnumC3378y5 enumC3378y513 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED;
        map13.put(c013, new com.ironsource.F0.a(enumC3378y513, enumC3378y513));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map14 = this.n;
        com.ironsource.C0 c014 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT;
        com.ironsource.EnumC3378y5 enumC3378y514 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT;
        map14.put(c014, new com.ironsource.F0.a(enumC3378y514, enumC3378y514));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map15 = this.n;
        com.ironsource.C0 c015 = com.ironsource.C0.TROUBLESHOOT_UNEXPECTED_OPENED;
        com.ironsource.EnumC3378y5 enumC3378y515 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_UNEXPECTED_OPENED;
        map15.put(c015, new com.ironsource.F0.a(enumC3378y515, enumC3378y515));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map16 = this.n;
        com.ironsource.C0 c016 = com.ironsource.C0.TROUBLESHOOT_INTERNAL_ERROR;
        com.ironsource.EnumC3378y5 enumC3378y516 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_INTERNAL_ERROR;
        map16.put(c016, new com.ironsource.F0.a(enumC3378y516, enumC3378y516));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map17 = this.n;
        com.ironsource.C0 c017 = com.ironsource.C0.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        com.ironsource.EnumC3378y5 enumC3378y517 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR;
        map17.put(c017, new com.ironsource.F0.a(enumC3378y517, enumC3378y517));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map18 = this.n;
        com.ironsource.C0 c018 = com.ironsource.C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        com.ironsource.EnumC3378y5 enumC3378y518 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR;
        map18.put(c018, new com.ironsource.F0.a(enumC3378y518, enumC3378y518));
        this.n.put(com.ironsource.C0.TROUBLESHOOT_NOTIFICATION_ERROR, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, null));
        this.n.put(com.ironsource.C0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, null));
        this.n.put(com.ironsource.C0.TROUBLESHOOT_IMPRESSION_TIMEOUT, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, null));
        this.n.put(com.ironsource.C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, null));
        this.n.put(com.ironsource.C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map19 = this.n;
        com.ironsource.C0 c019 = com.ironsource.C0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION;
        com.ironsource.EnumC3378y5 enumC3378y519 = com.ironsource.EnumC3378y5.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION;
        map19.put(c019, new com.ironsource.F0.a(enumC3378y519, enumC3378y519));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map20 = this.n;
        com.ironsource.C0 c020 = com.ironsource.C0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED;
        com.ironsource.EnumC3378y5 enumC3378y520 = com.ironsource.EnumC3378y5.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED;
        map20.put(c020, new com.ironsource.F0.a(enumC3378y520, enumC3378y520));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map21 = this.n;
        com.ironsource.C0 c021 = com.ironsource.C0.TROUBLESHOOT_ILLEGAL_STATE;
        com.ironsource.EnumC3378y5 enumC3378y521 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_ILLEGAL_STATE;
        map21.put(c021, new com.ironsource.F0.a(enumC3378y521, enumC3378y521));
        this.n.put(com.ironsource.C0.TROUBLESHOOT_RELOAD, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_RELOAD, null));
        java.util.Map<com.ironsource.C0, com.ironsource.F0.a> map22 = this.n;
        com.ironsource.C0 c022 = com.ironsource.C0.TROUBLESHOOT_LOAD_SKIPPED;
        com.ironsource.EnumC3378y5 enumC3378y522 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_LOAD_SKIPPED;
        map22.put(c022, new com.ironsource.F0.a(enumC3378y522, enumC3378y522));
        this.n.put(com.ironsource.C0.TROUBLESHOOT_ILR_REVENUE, new com.ironsource.F0.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_ILR_REVENUE, null));
    }
}
