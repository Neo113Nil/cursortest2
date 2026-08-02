package p000;

import android.content.Context;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wu1 implements ju1, InterfaceC0225fv {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8705j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ wu1 f8689k = new wu1(0);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ wu1 f8690l = new wu1(1);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ wu1 f8691m = new wu1(2);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ wu1 f8692n = new wu1(3);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ wu1 f8693o = new wu1(4);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ wu1 f8694p = new wu1(5);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ wu1 f8695q = new wu1(6);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ wu1 f8696r = new wu1(7);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ wu1 f8697s = new wu1(8);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ wu1 f8698t = new wu1(9);

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ wu1 f8699u = new wu1(10);

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ wu1 f8700v = new wu1(11);

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ wu1 f8701w = new wu1(12);

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ wu1 f8702x = new wu1(13);

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ wu1 f8703y = new wu1(14);

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ wu1 f8704z = new wu1(15);

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ wu1 f8676A = new wu1(16);

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ wu1 f8677B = new wu1(17);

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ wu1 f8678C = new wu1(18);

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ wu1 f8679D = new wu1(19);

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ wu1 f8680E = new wu1(20);

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ wu1 f8681F = new wu1(21);

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ wu1 f8682G = new wu1(22);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ wu1 f8683H = new wu1(23);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ wu1 f8684I = new wu1(24);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ wu1 f8685J = new wu1(25);

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ wu1 f8686K = new wu1(27);

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ wu1 f8687L = new wu1(28);

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ wu1 f8688M = new wu1(29);

    public /* synthetic */ wu1(int i) {
        this.f8705j = i;
    }

    @Override // p000.ju1
    /* JADX INFO: renamed from: a */
    public Object mo153a() {
        switch (this.f8705j) {
            case 0:
                List list = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(78, "measurement.upload.url", "https://app-measurement.com/a").get();
            case 1:
                List list2 = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
            case 2:
                List list3 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(52, 21600000L, "measurement.sgtm.upload.retry_max_wait").get();
            case 3:
                List list4 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(42, 10L, "measurement.sgtm.batch.retry_max_count").get()).longValue());
            case 4:
                List list5 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(50, 5000L, "measurement.sgtm.upload.min_delay_after_startup").get();
            case 5:
                List list6 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(40, 240000L, "measurement.sgtm.batch.long_queuing_threshold").get();
            case 6:
                List list7 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(79, 3600000L, "measurement.upload.window_interval").get();
            case 7:
                List list8 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(9, 1000L, "measurement.upload.debug_upload_interval").get();
            case 8:
                List list9 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(53, 86400000L, "measurement.upload.stale_data_deletion_interval").get();
            case 9:
                List list10 = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(8, "measurement.config.url_scheme", "https").get();
            case 10:
                List list11 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(73, 518400000L, "measurement.upload.max_queue_time").get();
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                List list12 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(22, 200L, "measurement.audience.filter_result_max_count").get()).longValue());
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                List list13 = jx1.f4164a;
                ds1.f1812k.get();
                return (Boolean) es1.f2179a.m93q(0, "measurement.test.boolean_flag", false).get();
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                List list14 = jx1.f4164a;
                ds1.f1812k.get();
                return (Long) es1.f2179a.m97u(4, -1L, "measurement.test.long_flag").get();
            case 14:
                List list15 = jx1.f4164a;
                ds1.f1812k.get();
                a81 a81Var = es1.f2179a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) a81Var.f63k;
                x52 x52Var = (x52) atomicReferenceArray.get(2);
                if (x52Var == null) {
                    n52 n52Var = new n52("measurement.test.double_flag", (p90) ((c32) a81Var.f64l).f1083k);
                    while (!atomicReferenceArray.compareAndSet(2, null, n52Var)) {
                        if (atomicReferenceArray.get(2) != null) {
                            x52Var = (x52) atomicReferenceArray.get(2);
                            x52Var.getClass();
                        }
                    }
                    x52Var = n52Var;
                }
                return (Double) x52Var.get();
            case 15:
                List list16 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(19, 500L, "measurement.upload.max_event_parameter_value_length").get()).longValue());
            case 16:
                List list17 = jx1.f4164a;
                ar1.f615k.get();
                return (Long) br1.f968a.m97u(62, 7200000L, "measurement.redaction.app_instance_id.ttl").get();
            case 17:
                List list18 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(18, 1L, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue());
            case 18:
                List list19 = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
            case 19:
                List list20 = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
            case 20:
                List list21 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(75, 65536L, "measurement.upload.max_batch_size").get()).longValue());
            case 21:
                List list22 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(55, 90L, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
            case 22:
                List list23 = jx1.f4164a;
                ar1.f615k.get();
                return (Boolean) br1.f968a.m93q(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get();
            case 23:
                List list24 = jx1.f4164a;
                ar1.f615k.get();
                return (Boolean) br1.f968a.m93q(10, "measurement.config.default_flag_values", true).get();
            case 24:
                List list25 = jx1.f4164a;
                return (Boolean) tr1.f7577b.get();
            case 25:
                List list26 = jx1.f4164a;
                return (Boolean) zr1.f9924a.get();
            case 26:
            default:
                List list27 = jx1.f4164a;
                fs1.f2490k.get();
                return (Boolean) gs1.f2868a.m93q(8, "measurement.rb.attribution.uuid_generation", true).get();
            case 27:
                List list28 = jx1.f4164a;
                return (Boolean) rr1.f6945b.get();
            case 28:
                List list29 = jx1.f4164a;
                return (Boolean) ss1.f7203a.get();
        }
    }

    @Override // p000.InterfaceC0225fv
    /* JADX INFO: renamed from: b */
    public int mo1892b(Context context, String str, boolean z) {
        return C0335iv.m2707d(context, str, z);
    }

    @Override // p000.InterfaceC0225fv
    /* JADX INFO: renamed from: c */
    public int mo1893c(Context context, String str) {
        return C0335iv.m2705a(context, str);
    }
}
