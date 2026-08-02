package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public enum zzbsx {
    NO_ERROR(0, com.google.android.libraries.places.internal.zzbnp.zzi),
    PROTOCOL_ERROR(1, com.google.android.libraries.places.internal.zzbnp.zzh),
    INTERNAL_ERROR(2, com.google.android.libraries.places.internal.zzbnp.zzh),
    FLOW_CONTROL_ERROR(3, com.google.android.libraries.places.internal.zzbnp.zzh),
    SETTINGS_TIMEOUT(4, com.google.android.libraries.places.internal.zzbnp.zzh),
    STREAM_CLOSED(5, com.google.android.libraries.places.internal.zzbnp.zzh),
    FRAME_SIZE_ERROR(6, com.google.android.libraries.places.internal.zzbnp.zzh),
    REFUSED_STREAM(7, com.google.android.libraries.places.internal.zzbnp.zzi),
    CANCEL(8, com.google.android.libraries.places.internal.zzbnp.zzb),
    COMPRESSION_ERROR(9, com.google.android.libraries.places.internal.zzbnp.zzh),
    CONNECT_ERROR(10, com.google.android.libraries.places.internal.zzbnp.zzh),
    ENHANCE_YOUR_CALM(11, com.google.android.libraries.places.internal.zzbnp.zzf.zze("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, com.google.android.libraries.places.internal.zzbnp.zze.zze("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, com.google.android.libraries.places.internal.zzbnp.zzc);

    private static final com.google.android.libraries.places.internal.zzbsx[] zzo;
    private final int zzp;
    private final com.google.android.libraries.places.internal.zzbnp zzq;

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
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbsx.<clinit>():void");
    }

    zzbsx(int i, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zzp = i;
        java.lang.String concat = "HTTP/2 error code: ".concat(java.lang.String.valueOf(name()));
        if (zzbnpVar.zzh() != null) {
            java.lang.String zzh = zzbnpVar.zzh();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(concat.length() + 2 + java.lang.String.valueOf(zzh).length() + 1);
            sb.append(concat);
            sb.append(" (");
            sb.append(zzh);
            sb.append(")");
            concat = sb.toString();
        }
        this.zzq = zzbnpVar.zze(concat);
    }

    public static com.google.android.libraries.places.internal.zzbnp zza(long j) {
        com.google.android.libraries.places.internal.zzbsx[] zzbsxVarArr = zzo;
        com.google.android.libraries.places.internal.zzbsx zzbsxVar = null;
        if (j < zzbsxVarArr.length && j >= 0) {
            zzbsxVar = zzbsxVarArr[(int) j];
        }
        if (zzbsxVar != null) {
            return zzbsxVar.zzq;
        }
        com.google.android.libraries.places.internal.zzbnp zza = com.google.android.libraries.places.internal.zzbnp.zza(INTERNAL_ERROR.zzq.zzg().zza());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 32);
        sb.append("Unrecognized HTTP/2 error code: ");
        sb.append(j);
        return zza.zze(sb.toString());
    }
}
