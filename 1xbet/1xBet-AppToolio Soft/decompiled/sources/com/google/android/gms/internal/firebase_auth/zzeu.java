package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
interface zzeu {
    int getTag();

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    String readString() throws IOException;

    void readStringList(List<String> list) throws IOException;

    <T> T zza(zzev<T> zzevVar, zzco zzcoVar) throws IOException;

    <T> void zza(List<T> list, zzev<T> zzevVar, zzco zzcoVar) throws IOException;

    <K, V> void zza(Map<K, V> map, zzea<K, V> zzeaVar, zzco zzcoVar) throws IOException;

    @Deprecated
    <T> T zzb(zzev<T> zzevVar, zzco zzcoVar) throws IOException;

    @Deprecated
    <T> void zzb(List<T> list, zzev<T> zzevVar, zzco zzcoVar) throws IOException;

    void zzc(List<Double> list) throws IOException;

    long zzcd() throws IOException;

    long zzce() throws IOException;

    int zzcf() throws IOException;

    long zzcg() throws IOException;

    int zzch() throws IOException;

    boolean zzci() throws IOException;

    String zzcj() throws IOException;

    zzbu zzck() throws IOException;

    int zzcl() throws IOException;

    int zzcm() throws IOException;

    int zzcn() throws IOException;

    long zzco() throws IOException;

    int zzcp() throws IOException;

    long zzcq() throws IOException;

    void zzd(List<Float> list) throws IOException;

    int zzda() throws IOException;

    boolean zzdb() throws IOException;

    void zze(List<Long> list) throws IOException;

    void zzf(List<Long> list) throws IOException;

    void zzg(List<Integer> list) throws IOException;

    void zzh(List<Long> list) throws IOException;

    void zzi(List<Integer> list) throws IOException;

    void zzj(List<Boolean> list) throws IOException;

    void zzk(List<String> list) throws IOException;

    void zzl(List<zzbu> list) throws IOException;

    void zzm(List<Integer> list) throws IOException;

    void zzn(List<Integer> list) throws IOException;

    void zzo(List<Integer> list) throws IOException;

    void zzp(List<Long> list) throws IOException;

    void zzq(List<Integer> list) throws IOException;

    void zzr(List<Long> list) throws IOException;
}
