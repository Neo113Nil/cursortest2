package com.google.android.gms.games.event;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public interface Event extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.event.Event>, android.os.Parcelable {
    java.lang.String getDescription();

    void getDescription(android.database.CharArrayBuffer charArrayBuffer);

    java.lang.String getEventId();

    java.lang.String getFormattedValue();

    void getFormattedValue(android.database.CharArrayBuffer charArrayBuffer);

    android.net.Uri getIconImageUri();

    @java.lang.Deprecated
    java.lang.String getIconImageUrl();

    java.lang.String getName();

    void getName(android.database.CharArrayBuffer charArrayBuffer);

    com.google.android.gms.games.Player getPlayer();

    long getValue();

    boolean isVisible();
}
