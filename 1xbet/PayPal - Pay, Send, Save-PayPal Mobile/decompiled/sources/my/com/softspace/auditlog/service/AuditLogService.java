package my.com.softspace.auditlog.service;

/* loaded from: classes17.dex */
public class AuditLogService {
    private static my.com.softspace.auditlog.service.AuditLogService getHighResolutionOutputSizeshNQ4ISI = null;
    private static boolean getHighSpeedVideoFpsRangesFor = false;

    public static my.com.softspace.auditlog.service.AuditLogService init(android.content.Context context) {
        my.com.softspace.auditlog.internal.AuditLogDatabase.init(context);
        my.com.softspace.auditlog.service.AuditLogService auditLogService = new my.com.softspace.auditlog.service.AuditLogService();
        getHighResolutionOutputSizeshNQ4ISI = auditLogService;
        getHighSpeedVideoFpsRangesFor = true;
        return auditLogService;
    }

    public static my.com.softspace.auditlog.service.AuditLogService getInstance() {
        if (!getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException();
        }
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static class AuditLogPayloadContext {
        private static final my.com.softspace.auditlog.service.AuditLogService.AuditLogPayloadContext getHighSpeedVideoFpsRanges = new my.com.softspace.auditlog.service.AuditLogService.AuditLogPayloadContext(null, null);
        final java.util.List<my.com.softspace.auditlog.internal.dto.LogEntry> getHighResolutionOutputSizeshNQ4ISI;
        private final byte[] getHighSpeedVideoFpsRangesFor;

        AuditLogPayloadContext(java.util.List<my.com.softspace.auditlog.internal.dto.LogEntry> list, byte[] bArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = list;
            this.getHighSpeedVideoFpsRangesFor = bArr;
        }

        public byte[] payload() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public boolean hasPayload() {
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            return bArr != null && bArr.length > 0;
        }

        public java.lang.String toString() {
            return android.util.Base64.encodeToString(this.getHighSpeedVideoFpsRangesFor, 2);
        }
    }

    public static class AttestTransactionPayloadContext {
        private static final my.com.softspace.auditlog.service.AuditLogService.AttestTransactionPayloadContext getHighSpeedVideoFpsRangesFor = new my.com.softspace.auditlog.service.AuditLogService.AttestTransactionPayloadContext(null, null);
        final java.util.List<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry> Camera2StreamConfigurationMap;
        private final byte[] getHighSpeedVideoSizes;

        AttestTransactionPayloadContext(java.util.List<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry> list, byte[] bArr) {
            this.Camera2StreamConfigurationMap = list;
            this.getHighSpeedVideoSizes = bArr;
        }

        public byte[] payload() {
            return this.getHighSpeedVideoSizes;
        }

        public boolean hasPayload() {
            byte[] bArr = this.getHighSpeedVideoSizes;
            return bArr != null && bArr.length > 0;
        }

        public java.lang.String toString() {
            return android.util.Base64.encodeToString(this.getHighSpeedVideoSizes, 2);
        }
    }

    public my.com.softspace.auditlog.service.AuditLogService.AuditLogPayloadContext prepareAuditLogPayload() {
        synchronized (this) {
            try {
                java.util.List<my.com.softspace.auditlog.internal.dto.LogEntry> all = my.com.softspace.auditlog.internal.AuditLogDatabase.getInstance().logEntryDAO().getAll();
                if (!my.com.softspace.common.functional.Lists.isEmpty(all)) {
                    return new my.com.softspace.auditlog.service.AuditLogService.AuditLogPayloadContext(all, Camera2StreamConfigurationMap(all));
                }
                return my.com.softspace.auditlog.service.AuditLogService.AuditLogPayloadContext.getHighSpeedVideoFpsRanges;
            } catch (java.io.IOException unused) {
                return my.com.softspace.auditlog.service.AuditLogService.AuditLogPayloadContext.getHighSpeedVideoFpsRanges;
            }
        }
    }

    public my.com.softspace.auditlog.service.AuditLogService.AttestTransactionPayloadContext prepareAttestTransactionPayload() {
        synchronized (this) {
            try {
                java.util.List<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry> all = my.com.softspace.auditlog.internal.AuditLogDatabase.getInstance().attestTransactionDAO().getAll();
                if (!my.com.softspace.common.functional.Lists.isEmpty(all)) {
                    return new my.com.softspace.auditlog.service.AuditLogService.AttestTransactionPayloadContext(all, getHighSpeedVideoSizes(all));
                }
                return my.com.softspace.auditlog.service.AuditLogService.AttestTransactionPayloadContext.getHighSpeedVideoFpsRangesFor;
            } catch (java.io.IOException unused) {
                return my.com.softspace.auditlog.service.AuditLogService.AttestTransactionPayloadContext.getHighSpeedVideoFpsRangesFor;
            }
        }
    }

    public void commitAuditLog(my.com.softspace.auditlog.service.AuditLogService.AuditLogPayloadContext auditLogPayloadContext, boolean z) {
        synchronized (this) {
            if (auditLogPayloadContext != null && z) {
                if (auditLogPayloadContext.hasPayload() && auditLogPayloadContext != my.com.softspace.auditlog.service.AuditLogService.AuditLogPayloadContext.getHighSpeedVideoFpsRanges) {
                    my.com.softspace.auditlog.internal.AuditLogDatabase.getInstance().logEntryDAO().delete(auditLogPayloadContext.getHighResolutionOutputSizeshNQ4ISI);
                }
            }
        }
    }

    public void commitAttestTransactionLog(my.com.softspace.auditlog.service.AuditLogService.AttestTransactionPayloadContext attestTransactionPayloadContext, boolean z) {
        synchronized (this) {
            if (attestTransactionPayloadContext != null && z) {
                if (attestTransactionPayloadContext.hasPayload() && attestTransactionPayloadContext != my.com.softspace.auditlog.service.AuditLogService.AttestTransactionPayloadContext.getHighSpeedVideoFpsRangesFor) {
                    my.com.softspace.auditlog.internal.AuditLogDatabase.getInstance().attestTransactionDAO().delete(attestTransactionPayloadContext.Camera2StreamConfigurationMap);
                }
            }
        }
    }

    private byte[] Camera2StreamConfigurationMap(java.util.List<my.com.softspace.auditlog.internal.dto.LogEntry> list) throws java.io.IOException {
        java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) my.com.softspace.common.functional.Lists.map(list, new java.util.function.Function() { // from class: my.com.softspace.auditlog.service.AuditLogService$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                org.json.JSONObject highSpeedVideoFpsRanges;
                my.com.softspace.auditlog.service.AuditLogService auditLogService = my.com.softspace.auditlog.service.AuditLogService.this;
                highSpeedVideoFpsRanges = my.com.softspace.auditlog.service.AuditLogService.getHighSpeedVideoFpsRanges((my.com.softspace.auditlog.internal.dto.LogEntry) obj);
                return highSpeedVideoFpsRanges;
            }
        })).toString();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(jSONArray.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (java.lang.Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private byte[] getHighSpeedVideoSizes(java.util.List<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry> list) throws java.io.IOException {
        try {
            java.lang.String jSONObject = new org.json.JSONObject().put("attestTransaction", new org.json.JSONArray((java.util.Collection) my.com.softspace.common.functional.Lists.map(list, new java.util.function.Function() { // from class: my.com.softspace.auditlog.service.AuditLogService$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    org.json.JSONObject Camera2StreamConfigurationMap;
                    my.com.softspace.auditlog.service.AuditLogService auditLogService = my.com.softspace.auditlog.service.AuditLogService.this;
                    Camera2StreamConfigurationMap = my.com.softspace.auditlog.service.AuditLogService.Camera2StreamConfigurationMap((my.com.softspace.auditlog.internal.dto.AttestTransactionEntry) obj);
                    return Camera2StreamConfigurationMap;
                }
            }))).toString();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(jSONObject.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.json.JSONObject getHighSpeedVideoFpsRanges(my.com.softspace.auditlog.internal.dto.LogEntry logEntry) {
        try {
            return new org.json.JSONObject().put("dateTime", logEntry.getDateTime()).put("attestId", logEntry.getAttestID()).put("userUuid", logEntry.getUserUuid()).put("event", logEntry.getEvent()).put("status", logEntry.getStatus()).put("origination", logEntry.getOrigination()).putOpt("log", logEntry.getLog()).put(com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, logEntry.getThrowable());
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.json.JSONObject Camera2StreamConfigurationMap(my.com.softspace.auditlog.internal.dto.AttestTransactionEntry attestTransactionEntry) {
        try {
            return new org.json.JSONObject().put("attestId", attestTransactionEntry.getAttestId()).put("ksn", attestTransactionEntry.getKsn()).put("timestamp", attestTransactionEntry.getTimestamp());
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
