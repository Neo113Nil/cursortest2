package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzfq extends com.google.android.gms.internal.play_games_inputmapping.zzfs {
    private static final java.lang.Class zza = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    private zzfq() {
        super(null);
    }

    /* synthetic */ zzfq(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfs
    final void zza(java.lang.Object obj, long j) {
        java.lang.Object unmodifiableList;
        java.util.List list = (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j);
        if (list instanceof com.google.android.gms.internal.play_games_inputmapping.zzfp) {
            unmodifiableList = ((com.google.android.gms.internal.play_games_inputmapping.zzfp) list).zzg();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof com.google.android.gms.internal.play_games_inputmapping.zzgl) && (list instanceof com.google.android.gms.internal.play_games_inputmapping.zzfh)) {
                com.google.android.gms.internal.play_games_inputmapping.zzfh zzfhVar = (com.google.android.gms.internal.play_games_inputmapping.zzfh) list;
                if (zzfhVar.zza()) {
                    zzfhVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzfs
    final void zzb(java.lang.Object obj, java.lang.Object obj2, long j) {
        com.google.android.gms.internal.play_games_inputmapping.zzfo zzfoVar;
        java.util.List list = (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj2, j);
        int size = list.size();
        java.util.List list2 = (java.util.List) com.google.android.gms.internal.play_games_inputmapping.zzhn.zzn(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof com.google.android.gms.internal.play_games_inputmapping.zzfp ? new com.google.android.gms.internal.play_games_inputmapping.zzfo(size) : ((list2 instanceof com.google.android.gms.internal.play_games_inputmapping.zzgl) && (list2 instanceof com.google.android.gms.internal.play_games_inputmapping.zzfh)) ? ((com.google.android.gms.internal.play_games_inputmapping.zzfh) list2).zzh(size) : new java.util.ArrayList(size);
            com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, arrayList);
                zzfoVar = arrayList;
            } else if (list2 instanceof com.google.android.gms.internal.play_games_inputmapping.zzhi) {
                com.google.android.gms.internal.play_games_inputmapping.zzfo zzfoVar2 = new com.google.android.gms.internal.play_games_inputmapping.zzfo(list2.size() + size);
                zzfoVar2.addAll(zzfoVar2.size(), (com.google.android.gms.internal.play_games_inputmapping.zzhi) list2);
                com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, zzfoVar2);
                zzfoVar = zzfoVar2;
            } else if ((list2 instanceof com.google.android.gms.internal.play_games_inputmapping.zzgl) && (list2 instanceof com.google.android.gms.internal.play_games_inputmapping.zzfh)) {
                com.google.android.gms.internal.play_games_inputmapping.zzfh zzfhVar = (com.google.android.gms.internal.play_games_inputmapping.zzfh) list2;
                if (!zzfhVar.zza()) {
                    list2 = zzfhVar.zzh(list2.size() + size);
                    com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, list2);
                }
            }
            list2 = zzfoVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzhn.zzo(obj, j, list);
    }
}
