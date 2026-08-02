package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzcd {
    private static volatile boolean zzmv = false;
    int zzmq;
    int zzmr;
    private int zzms;
    zzcg zzmt;
    private boolean zzmu;

    private zzcd() {
        this.zzmr = 100;
        this.zzms = Integer.MAX_VALUE;
        this.zzmu = false;
    }

    static zzcd zza(byte[] bArr, int i, int i2, boolean z) {
        zzcf zzcfVar = new zzcf(bArr, i, i2, false);
        try {
            zzcfVar.zzp(i2);
            return zzcfVar;
        } catch (zzdh e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static zzcd zzd(byte[] bArr, int i, int i2) {
        return zza(bArr, i, i2, false);
    }

    public abstract double readDouble() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract String readString() throws IOException;

    public abstract <T extends zzeh> T zza(zzer<T> zzerVar, zzco zzcoVar) throws IOException;

    public abstract int zzcc() throws IOException;

    public abstract long zzcd() throws IOException;

    public abstract long zzce() throws IOException;

    public abstract int zzcf() throws IOException;

    public abstract long zzcg() throws IOException;

    public abstract int zzch() throws IOException;

    public abstract boolean zzci() throws IOException;

    public abstract String zzcj() throws IOException;

    public abstract zzbu zzck() throws IOException;

    public abstract int zzcl() throws IOException;

    public abstract int zzcm() throws IOException;

    public abstract int zzcn() throws IOException;

    public abstract long zzco() throws IOException;

    public abstract int zzcp() throws IOException;

    public abstract long zzcq() throws IOException;

    abstract long zzcr() throws IOException;

    public abstract boolean zzcs() throws IOException;

    public abstract int zzct();

    public abstract void zzm(int i) throws zzdh;

    public abstract boolean zzn(int i) throws IOException;

    public final int zzo(int i) {
        if (i >= 0) {
            int i2 = this.zzmr;
            this.zzmr = i;
            return i2;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Recursion limit cannot be negative: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract int zzp(int i) throws zzdh;

    public abstract void zzq(int i);

    public abstract void zzr(int i) throws IOException;
}
