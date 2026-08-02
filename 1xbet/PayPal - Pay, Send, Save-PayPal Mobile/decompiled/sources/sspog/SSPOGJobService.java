package sspog;

/* loaded from: classes18.dex */
public class SSPOGJobService extends android.app.job.JobService {
    private static final int ATTESTATION_TIMEOUT = 15000;
    private static final java.lang.String EXTRA_KEY_MIN_REFRESH_INTERNAL = "MINIMUM_REFRESH_INTERVAL";
    private static final java.lang.String EXTRA_KEY_REFRESH_INTERVAL = "REFRESH-INTERVAL";
    private static final java.lang.String EXTRA_KEY_RUN_ATTESTATION = "RUN_ATTESTATION";
    private static final java.lang.String EXTRA_KEY_RUN_ATTEST_TRANSACTION_LOGGING = "RUN_ATTEST_TRANSACTION_LOGGING";
    private static final java.lang.String EXTRA_KEY_RUN_AUDIT_LOGGING = "RUN_AUDIT_LOGGING";
    private static final int JOBID_SSPOG_JOB = 55010001;
    private static final java.lang.String TAG = "cpplog-java";

    private boolean dummy(android.content.Context context) {
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final android.app.job.JobParameters jobParameters) {
        java.util.concurrent.CompletableFuture.supplyAsync(new java.util.function.Supplier() { // from class: sspog.SSPOGJobService$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                java.lang.Boolean lambda$onStartJob$0;
                lambda$onStartJob$0 = sspog.SSPOGJobService.this.lambda$onStartJob$0(jobParameters);
                return lambda$onStartJob$0;
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ java.lang.Boolean lambda$onStartJob$0(android.app.job.JobParameters jobParameters) {
        boolean z;
        boolean runAuditLogging;
        boolean runAttestTransactionLogging;
        long j;
        long j2;
        android.content.Context applicationContext = getApplicationContext();
        android.os.PersistableBundle extras = jobParameters.getExtras();
        try {
            z = extras.getBoolean(EXTRA_KEY_RUN_ATTESTATION, true) ? runAttestation(applicationContext) : true;
        } catch (java.lang.Exception e) {
            sspog.SimpleLogger.e(TAG, e.getMessage(), e);
            scheduleTask(applicationContext, false, true, true, true, jobParameters.getExtras().getLong(EXTRA_KEY_MIN_REFRESH_INTERNAL, 180000L), jobParameters.getExtras().getLong(EXTRA_KEY_REFRESH_INTERVAL, 240000L));
            z = false;
            if (extras.getBoolean(EXTRA_KEY_RUN_AUDIT_LOGGING, true)) {
            }
            if (extras.getBoolean(EXTRA_KEY_RUN_ATTEST_TRANSACTION_LOGGING, true)) {
            }
            sspog.SimpleLogger.d(TAG, java.lang.String.format("jobFinish %s", java.lang.Boolean.valueOf(!z && runAuditLogging && runAttestTransactionLogging).toString()), new java.lang.Object[0]);
            jobFinished(jobParameters, false);
            j = jobParameters.getExtras().getLong(EXTRA_KEY_REFRESH_INTERVAL, 300000L);
            j2 = jobParameters.getExtras().getLong(EXTRA_KEY_MIN_REFRESH_INTERNAL, 180000L);
            if (z) {
            }
            sspog.SimpleLogger.d(TAG, "jobFinish repeat after 4 min", new java.lang.Object[0]);
            scheduleTask(applicationContext, false, !z, !runAuditLogging, !runAttestTransactionLogging, j2, j);
            return java.lang.Boolean.TRUE;
        } catch (java.lang.UnsatisfiedLinkError e2) {
            sspog.SimpleLogger.e(TAG, e2.getMessage(), e2);
            stop(applicationContext);
            z = false;
            if (extras.getBoolean(EXTRA_KEY_RUN_AUDIT_LOGGING, true)) {
            }
            if (extras.getBoolean(EXTRA_KEY_RUN_ATTEST_TRANSACTION_LOGGING, true)) {
            }
            sspog.SimpleLogger.d(TAG, java.lang.String.format("jobFinish %s", java.lang.Boolean.valueOf(!z && runAuditLogging && runAttestTransactionLogging).toString()), new java.lang.Object[0]);
            jobFinished(jobParameters, false);
            j = jobParameters.getExtras().getLong(EXTRA_KEY_REFRESH_INTERVAL, 300000L);
            j2 = jobParameters.getExtras().getLong(EXTRA_KEY_MIN_REFRESH_INTERNAL, 180000L);
            if (z) {
            }
            sspog.SimpleLogger.d(TAG, "jobFinish repeat after 4 min", new java.lang.Object[0]);
            scheduleTask(applicationContext, false, !z, !runAuditLogging, !runAttestTransactionLogging, j2, j);
            return java.lang.Boolean.TRUE;
        }
        runAuditLogging = extras.getBoolean(EXTRA_KEY_RUN_AUDIT_LOGGING, true) ? runAuditLogging(applicationContext) : true;
        runAttestTransactionLogging = extras.getBoolean(EXTRA_KEY_RUN_ATTEST_TRANSACTION_LOGGING, true) ? runAttestTransactionLogging(applicationContext) : true;
        sspog.SimpleLogger.d(TAG, java.lang.String.format("jobFinish %s", java.lang.Boolean.valueOf(!z && runAuditLogging && runAttestTransactionLogging).toString()), new java.lang.Object[0]);
        jobFinished(jobParameters, false);
        j = jobParameters.getExtras().getLong(EXTRA_KEY_REFRESH_INTERVAL, 300000L);
        j2 = jobParameters.getExtras().getLong(EXTRA_KEY_MIN_REFRESH_INTERNAL, 180000L);
        if (z || !runAuditLogging) {
            sspog.SimpleLogger.d(TAG, "jobFinish repeat after 4 min", new java.lang.Object[0]);
            scheduleTask(applicationContext, false, !z, !runAuditLogging, !runAttestTransactionLogging, j2, j);
        } else {
            sspog.SimpleLogger.d(TAG, "jobFinish repeat after 4 min", new java.lang.Object[0]);
            scheduleTask(applicationContext, false, true, true, true, j2, j);
        }
        return java.lang.Boolean.TRUE;
    }

    @Override // android.app.job.JobService
    public void onNetworkChanged(android.app.job.JobParameters jobParameters) {
        super.onNetworkChanged(jobParameters);
    }

    private static void scheduleTask(android.content.Context context, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2) {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putLong(EXTRA_KEY_REFRESH_INTERVAL, j2);
        persistableBundle.putLong(EXTRA_KEY_MIN_REFRESH_INTERNAL, j);
        persistableBundle.putBoolean(EXTRA_KEY_RUN_ATTESTATION, z2);
        persistableBundle.putBoolean(EXTRA_KEY_RUN_AUDIT_LOGGING, z3);
        persistableBundle.putBoolean(EXTRA_KEY_RUN_ATTEST_TRANSACTION_LOGGING, z4);
        android.app.job.JobInfo.Builder extras = new android.app.job.JobInfo.Builder(JOBID_SSPOG_JOB, new android.content.ComponentName(context, (java.lang.Class<?>) sspog.SSPOGJobService.class)).setRequiredNetworkType(1).setExtras(persistableBundle);
        if (z) {
            extras.setMinimumLatency(0L);
            extras.setOverrideDeadline(0L);
        } else if (j < j2) {
            long nextLong = sspog.SSPOGService.getInstance().getSecureRandom().nextLong();
            while (nextLong < 0) {
                nextLong = sspog.SSPOGService.getInstance().getSecureRandom().nextLong();
            }
            extras.setMinimumLatency(j + (nextLong % (j2 - j)));
        } else {
            extras.setMinimumLatency(j2);
        }
        ((android.app.job.JobScheduler) context.getSystemService("jobscheduler")).schedule(extras.build());
    }

    public static void start(android.content.Context context, boolean z, long j, long j2) {
        synchronized (sspog.SSPOGJobService.class) {
            if (!isJobServiceOn(context)) {
                stop(context);
                sspog.SimpleLogger.d("SSPOGAppLifecycleService", "[start service]", new java.lang.Object[0]);
                scheduleTask(context, z, true, true, true, j, j2);
            }
        }
    }

    public static void stop(android.content.Context context) {
        synchronized (sspog.SSPOGJobService.class) {
            sspog.SimpleLogger.d(TAG, "[stop service]", new java.lang.Object[0]);
            ((android.app.job.JobScheduler) context.getSystemService("jobscheduler")).cancel(JOBID_SSPOG_JOB);
        }
    }

    private boolean runAuditLogging(android.content.Context context) {
        sspog.SimpleLogger.i(TAG, "Collecting Audit Log", new java.lang.Object[0]);
        my.com.softspace.auditlog.service.AuditLogService.AuditLogPayloadContext prepareAuditLogPayload = my.com.softspace.auditlog.service.AuditLogService.getInstance().prepareAuditLogPayload();
        if (!prepareAuditLogPayload.hasPayload()) {
            return true;
        }
        sspog.SimpleLogger.i(TAG, "Uploading Audit Log", new java.lang.Object[0]);
        int uploadPayloadTo = sspog.SSPOGService.getInstance().uploadPayloadTo(context, "/at/auditlog", prepareAuditLogPayload.toString());
        sspog.SimpleLogger.i(TAG, "Uploading Audit Log result: %d", java.lang.Integer.valueOf(uploadPayloadTo));
        if (uploadPayloadTo == sspog.SSPOGError.RST_OK.getCode()) {
            my.com.softspace.auditlog.service.AuditLogService.getInstance().commitAuditLog(prepareAuditLogPayload, true);
            return true;
        }
        if (uploadPayloadTo == sspog.SSPOGError.RST_NOT_INIT.getCode()) {
            sspog.SimpleLogger.w(TAG, "Upload Audit Log fail, SSPOG not yet init!!", new java.lang.Object[0]);
            return false;
        }
        if (uploadPayloadTo == sspog.SSPOGError.RST_NO_PERMISSION.getCode()) {
            sspog.SimpleLogger.w(TAG, "Upload Audit Log fail, No permission grant!!", new java.lang.Object[0]);
            return false;
        }
        sspog.SSPOGServiceStatus lastServiceStatus = sspog.SSPOGService.getInstance().getLastServiceStatus();
        sspog.SimpleLogger.e(TAG, "Upload Audit Log fail, status: %s, message: %s", lastServiceStatus.getStatus(), lastServiceStatus.getMessage());
        return false;
    }

    private boolean runAttestTransactionLogging(android.content.Context context) {
        sspog.SimpleLogger.i(TAG, "Collecting Attest Transaction Log", new java.lang.Object[0]);
        my.com.softspace.auditlog.service.AuditLogService.AttestTransactionPayloadContext prepareAttestTransactionPayload = my.com.softspace.auditlog.service.AuditLogService.getInstance().prepareAttestTransactionPayload();
        if (!prepareAttestTransactionPayload.hasPayload()) {
            return true;
        }
        sspog.SimpleLogger.i(TAG, "Uploading Attest Transaction Log", new java.lang.Object[0]);
        int uploadPayloadTo = sspog.SSPOGService.getInstance().uploadPayloadTo(context, "/at/cotsupdate", prepareAttestTransactionPayload.toString());
        sspog.SimpleLogger.i(TAG, "Uploading Attest Transaction Log result: %d", java.lang.Integer.valueOf(uploadPayloadTo));
        if (uploadPayloadTo == sspog.SSPOGError.RST_OK.getCode()) {
            my.com.softspace.auditlog.service.AuditLogService.getInstance().commitAttestTransactionLog(prepareAttestTransactionPayload, true);
            return true;
        }
        if (uploadPayloadTo == sspog.SSPOGError.RST_NOT_INIT.getCode()) {
            sspog.SimpleLogger.w(TAG, "Upload Attest Transaction Log fail, SSPOG not yet init!!", new java.lang.Object[0]);
            return false;
        }
        if (uploadPayloadTo == sspog.SSPOGError.RST_NO_PERMISSION.getCode()) {
            sspog.SimpleLogger.w(TAG, "Upload Attest Transaction Log fail, No permission grant!!", new java.lang.Object[0]);
            return false;
        }
        sspog.SSPOGServiceStatus lastServiceStatus = sspog.SSPOGService.getInstance().getLastServiceStatus();
        sspog.SimpleLogger.e(TAG, "Upload Attest Transaction Log fail, status: %s, message: %s", lastServiceStatus.getStatus(), lastServiceStatus.getMessage());
        return false;
    }

    private boolean runAttestation(android.content.Context context) {
        sspog.SimpleLogger.i(TAG, "Running schedule attestation", new java.lang.Object[0]);
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(-1);
        sspog.SSPOG.rt();
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("job_attestation", java.lang.Boolean.toString(true));
        try {
            android.util.Pair<java.lang.Integer, java.util.List<sspog.SSPOGSuggestedAction>> pair = sspog.SSPOGService.getInstance().attest(context, hashMap, my.com.softspace.auditlog.service.intf.AuditLogger.Originator.SYSTEM.getOrdinal()).get(15000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            int code = pair.first == null ? sspog.SSPOGError.RST_GENERAL_ERROR.getCode() : ((java.lang.Integer) pair.first).intValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("attestation service finished with result: ");
            sb.append(code);
            sspog.SimpleLogger.d(TAG, sb.toString(), new java.lang.Object[0]);
            atomicInteger.set(code);
            int intValue = atomicInteger.intValue();
            if (intValue == sspog.SSPOGError.RST_NOT_INIT.getCode()) {
                sspog.SimpleLogger.w(TAG, "Attest failed, SSPOG is not init", new java.lang.Object[0]);
                return false;
            }
            if (intValue == sspog.SSPOGError.RST_NO_PERMISSION.getCode()) {
                sspog.SimpleLogger.w(TAG, "Attest failed, No permission grant", new java.lang.Object[0]);
                return false;
            }
            if (intValue == sspog.SSPOGError.RST_POG_NETWORK_ERROR.getCode()) {
                sspog.SimpleLogger.w(TAG, "Attest failed, Network error", new java.lang.Object[0]);
                return false;
            }
            if (intValue != sspog.SSPOGError.RST_OK.getCode()) {
                sspog.SimpleLogger.e(TAG, "Attestation fail, status: %s", java.lang.Integer.valueOf(intValue));
                return false;
            }
            sspog.SimpleLogger.i(TAG, "Attest okay", new java.lang.Object[0]);
            return true;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Attest failed: ");
            sb2.append(e.getMessage());
            sspog.SimpleLogger.e(TAG, e, sb2.toString(), new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean isJobServiceOn(android.content.Context context) {
        java.util.Iterator<android.app.job.JobInfo> it = ((android.app.job.JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == JOBID_SSPOG_JOB) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
