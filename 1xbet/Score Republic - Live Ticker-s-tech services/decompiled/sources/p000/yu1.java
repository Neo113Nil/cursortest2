package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yu1 implements ju1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9503j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ yu1 f9487k = new yu1(0);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ yu1 f9488l = new yu1(1);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ yu1 f9489m = new yu1(2);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ yu1 f9490n = new yu1(3);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ yu1 f9491o = new yu1(4);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ yu1 f9492p = new yu1(5);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ yu1 f9493q = new yu1(6);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ yu1 f9494r = new yu1(7);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ yu1 f9495s = new yu1(8);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ yu1 f9496t = new yu1(9);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ yu1 f9497u = new yu1(10);

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ yu1 f9498v = new yu1(11);

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ yu1 f9499w = new yu1(12);

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ yu1 f9500x = new yu1(13);

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ yu1 f9501y = new yu1(14);

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ yu1 f9502z = new yu1(15);

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ yu1 f9473A = new yu1(16);

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ yu1 f9474B = new yu1(17);

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ yu1 f9475C = new yu1(18);

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ yu1 f9476D = new yu1(19);

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ yu1 f9477E = new yu1(20);

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ yu1 f9478F = new yu1(21);

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ yu1 f9479G = new yu1(22);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ yu1 f9480H = new yu1(23);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ yu1 f9481I = new yu1(24);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ yu1 f9482J = new yu1(25);

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ yu1 f9483K = new yu1(26);

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ yu1 f9484L = new yu1(27);

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ yu1 f9485M = new yu1(28);

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ yu1 f9486N = new yu1(29);

    public /* synthetic */ yu1(int i) {
        this.f9503j = i;
    }

    @Override // p000.ju1
    /* JADX INFO: renamed from: a */
    public final Object mo153a() {
        switch (this.f9503j) {
            case 0:
                List list = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(44, "measurement.sgtm.service_upload_apps_list", "").get();
            case 1:
                List list2 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(29, 86400000L, "measurement.monitoring.sample_period_millis").get();
            case 2:
                List list3 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(43, 21600000L, "measurement.sgtm.batch.retry_max_wait").get();
            case 3:
                List list4 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(46, 5L, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue());
            case 4:
                List list5 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(48, 600000L, "measurement.sgtm.upload.min_delay_after_background").get();
            case 5:
                List list6 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(63, 43200000L, "measurement.upload.backoff_period").get();
            case 6:
                List list7 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(33, 10000L, "measurement.upload.realtime_upload_interval").get();
            case 7:
                List list8 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(27, 60000L, "measurement.alarm_manager.minimum_interval").get();
            case 8:
                List list9 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(64, 15000L, "measurement.upload.initial_upload_delay_time").get();
            case 9:
                List list10 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(76, 6L, "measurement.upload.retry_count").get()).longValue());
            case 10:
                List list11 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(17, 4L, "measurement.lifetimevalue.max_currency_tracked").get()).longValue());
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                List list12 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(38, 1000L, "measurement.service_client.reconnect_millis").get();
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                List list13 = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(7, "measurement.config.url_authority", "app-measurement.com").get();
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                List list14 = jx1.f4164a;
                ds1.f1812k.get();
                return Integer.valueOf((int) ((Long) es1.f2179a.m97u(3, -2L, "measurement.test.int_flag").get()).longValue());
            case 14:
                List list15 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(23, 27L, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
            case 15:
                List list16 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(61, 604800000L, "measurement.sdk.attribution.cache.ttl").get();
            case 16:
                List list17 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(26, 7L, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case 17:
                List list18 = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
            case 18:
                List list19 = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(32, "measurement.rb.attribution.app_allowlist", "").get();
            case 19:
                List list20 = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
            case 20:
                List list21 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(54, 16L, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue());
            case 21:
                List list22 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(24, 1000L, "measurement.rb.max_trigger_registrations_per_day").get()).longValue());
            case 22:
                List list23 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(30, 3000L, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
            case 23:
                List list24 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(66, 65536L, "measurement.upload.max_bundle_size").get()).longValue());
            case 24:
                List list25 = jx1.f4164a;
                return (Boolean) tr1.f7578c.get();
            case 25:
                List list26 = jx1.f4164a;
                return (Boolean) ys1.f9460a.get();
            case 26:
                List list27 = jx1.f4164a;
                return (Boolean) rr1.f6944a.get();
            case 27:
                List list28 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(70, 1000L, "measurement.upload.max_events_per_bundle").get()).longValue());
            case 28:
                List list29 = jx1.f4164a;
                fs1.f2490k.get();
                return (Boolean) gs1.f2868a.m93q(1, "measurement.rb.attribution.client2", true).get();
            default:
                List list30 = jx1.f4164a;
                fs1.f2490k.get();
                return (Boolean) gs1.f2868a.m93q(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get();
        }
    }
}
