package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzda implements java.util.Comparator {
    zzda() {
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.String) ((java.util.Map.Entry) obj).getKey()).compareTo((java.lang.String) ((java.util.Map.Entry) obj2).getKey());
    }
}
