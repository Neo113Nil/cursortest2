package com.iab.omid.library.unity3d.adsession.media;

/* loaded from: classes5.dex */
public enum InteractionType {
    CLICK(com.ironsource.Y3.d),
    INVITATION_ACCEPTED("invitationAccept");

    java.lang.String interactionType;

    InteractionType(java.lang.String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.interactionType;
    }
}
