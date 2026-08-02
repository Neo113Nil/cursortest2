package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xu1 implements ju1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9088j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ xu1 f9072k = new xu1(0);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ xu1 f9073l = new xu1(1);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ xu1 f9074m = new xu1(2);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ xu1 f9075n = new xu1(3);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ xu1 f9076o = new xu1(4);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ xu1 f9077p = new xu1(5);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ xu1 f9078q = new xu1(6);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ xu1 f9079r = new xu1(7);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ xu1 f9080s = new xu1(8);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ xu1 f9081t = new xu1(9);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ xu1 f9082u = new xu1(10);

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ xu1 f9083v = new xu1(11);

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ xu1 f9084w = new xu1(12);

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ xu1 f9085x = new xu1(13);

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ xu1 f9086y = new xu1(14);

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ xu1 f9087z = new xu1(15);

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ xu1 f9058A = new xu1(16);

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ xu1 f9059B = new xu1(17);

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ xu1 f9060C = new xu1(18);

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ xu1 f9061D = new xu1(19);

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ xu1 f9062E = new xu1(20);

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ xu1 f9063F = new xu1(21);

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ xu1 f9064G = new xu1(22);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ xu1 f9065H = new xu1(23);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ xu1 f9066I = new xu1(24);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ xu1 f9067J = new xu1(25);

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ xu1 f9068K = new xu1(26);

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ xu1 f9069L = new xu1(27);

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ xu1 f9070M = new xu1(28);

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ xu1 f9071N = new xu1(29);

    public /* synthetic */ xu1(int i) {
        this.f9088j = i;
    }

    @Override // p000.ju1
    /* JADX INFO: renamed from: a */
    public final Object mo153a() {
        switch (this.f9088j) {
            case 0:
                List list = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
            case 1:
                List list2 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(51, 600000L, "measurement.sgtm.upload.retry_interval").get();
            case 2:
                List list3 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(41, 1800000L, "measurement.sgtm.batch.retry_interval").get();
            case 3:
                List list4 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(47, 5000L, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
            case 4:
                List list5 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(49, 1000L, "measurement.sgtm.upload.min_delay_after_broadcast").get();
            case 5:
                List list6 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(5, 86400000L, "measurement.config.cache_time").get();
            case 6:
                List list7 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(65, 3600000L, "measurement.upload.interval").get();
            case 7:
                List list8 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(28, 500L, "measurement.upload.minimum_delay").get();
            case 8:
                List list9 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(34, 604800000L, "measurement.upload.refresh_blacklisted_config_interval").get();
            case 9:
                List list10 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(77, 1800000L, "measurement.upload.retry_time").get();
            case 10:
                List list11 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(15, 605000L, "measurement.upload.google_signal_max_queue_time").get();
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                List list12 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(36, 5000L, "measurement.service_client.idle_disconnect_millis").get();
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                List list13 = jx1.f4164a;
                ds1.f1812k.get();
                return (String) es1.f2179a.m99w(5, "measurement.test.string_flag", "---").get();
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                List list14 = jx1.f4164a;
                ds1.f1812k.get();
                return (Long) es1.f2179a.m97u(1, -1L, "measurement.test.cached_long_flag").get();
            case 14:
                List list15 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(21, 50L, "measurement.experiment.max_ids").get()).longValue());
            case 15:
                List list16 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(3, 100L, "measurement.max_bundles_per_iteration").get()).longValue());
            case 16:
                List list17 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(67, 100L, "measurement.upload.max_bundles").get()).longValue());
            case 17:
                List list18 = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(60, "measurement.rb.attribution.uri_scheme", "https").get();
            case 18:
                List list19 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(12, 3600000L, "measurement.session.engagement_interval").get();
            case 19:
                List list20 = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(13, "measurement.rb.attribution.event_params", "value|currency").get();
            case 20:
                List list21 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(57, 864000000L, "measurement.rb.attribution.max_queue_time").get();
            case 21:
                List list22 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(25, 0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
            case 22:
                List list23 = jx1.f4164a;
                ar1.f615k.get();
                return (Boolean) br1.f968a.m93q(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get();
            case 23:
                List list24 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(11, 3600000L, "45769094").get();
            case 24:
                List list25 = jx1.f4164a;
                return (Boolean) tr1.f7576a.get();
            case 25:
                List list26 = jx1.f4164a;
                return (Boolean) ws1.f8657a.get();
            case 26:
                List list27 = jx1.f4164a;
                return Integer.valueOf((int) ((Long) dr1.f1804a.get()).longValue());
            case 27:
                List list28 = jx1.f4164a;
                return (Boolean) os1.f5853a.get();
            case 28:
                List list29 = jx1.f4164a;
                fs1.f2490k.get();
                return (Boolean) gs1.f2868a.m93q(6, "measurement.rb.attribution.service", true).get();
            default:
                List list30 = jx1.f4164a;
                fs1.f2490k.get();
                return (Boolean) gs1.f2868a.m93q(7, "measurement.rb.attribution.enable_trigger_redaction", true).get();
        }
    }
}
