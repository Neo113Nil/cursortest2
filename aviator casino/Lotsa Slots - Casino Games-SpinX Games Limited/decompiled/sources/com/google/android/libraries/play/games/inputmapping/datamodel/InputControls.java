package com.google.android.libraries.play.games.inputmapping.datamodel;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class InputControls {
    public static final int MOUSE_ACTION_UNSPECIFIED = 0;
    public static final int MOUSE_BACK_CLICK = 4;
    public static final int MOUSE_FORWARD_CLICK = 3;
    public static final int MOUSE_LEFT_CLICK = 10;
    public static final int MOUSE_LEFT_DRAG = 8;
    public static final int MOUSE_MOVEMENT = 7;
    public static final int MOUSE_RIGHT_CLICK = 1;
    public static final int MOUSE_RIGHT_DRAG = 9;
    public static final int MOUSE_SCROLL_DOWN = 6;
    public static final int MOUSE_SCROLL_UP = 5;
    public static final int MOUSE_TERTIARY_CLICK = 2;

    public static com.google.android.libraries.play.games.inputmapping.datamodel.InputControls create(java.util.List<java.lang.Integer> list, java.util.List<java.lang.Integer> list2) {
        return new com.google.android.libraries.play.games.inputmapping.datamodel.AutoValue_InputControls(list, list2);
    }

    abstract java.util.List<java.lang.Integer> keycodes();

    abstract java.util.List<java.lang.Integer> mouseActions();

    com.google.android.gms.internal.play_games_inputmapping.zzf toProto() {
        com.google.android.gms.internal.play_games_inputmapping.zze zza = com.google.android.gms.internal.play_games_inputmapping.zzf.zza();
        java.util.Iterator<java.lang.Integer> it = keycodes().iterator();
        while (it.hasNext()) {
            zza.zza(it.next().intValue());
        }
        zza.zzb(mouseActions());
        return (com.google.android.gms.internal.play_games_inputmapping.zzf) zza.zzj();
    }
}
