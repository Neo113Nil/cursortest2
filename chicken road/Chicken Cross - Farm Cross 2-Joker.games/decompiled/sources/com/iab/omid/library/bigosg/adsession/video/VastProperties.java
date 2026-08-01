package com.iab.omid.library.bigosg.adsession.video;

import com.iab.omid.library.bigosg.d.e;

/* loaded from: classes4.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6092a;
    private final Float b;
    private final boolean c;
    private final Position d;
    private com.iab.omid.library.bigosg.adsession.media.VastProperties e;

    private VastProperties(boolean z, Float f, boolean z2, Position position, com.iab.omid.library.bigosg.adsession.media.VastProperties vastProperties) {
        this.f6092a = z;
        this.b = f;
        this.c = z2;
        this.d = position;
        this.e = vastProperties;
    }

    public static VastProperties createVastPropertiesForNonSkippableVideo(boolean z, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z, position, com.iab.omid.library.bigosg.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(z, com.iab.omid.library.bigosg.adsession.media.Position.valueOf(position.toString().toUpperCase())));
    }

    public static VastProperties createVastPropertiesForSkippableVideo(float f, boolean z, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position, com.iab.omid.library.bigosg.adsession.media.VastProperties.createVastPropertiesForSkippableMedia(f, z, com.iab.omid.library.bigosg.adsession.media.Position.valueOf(position.toString().toUpperCase())));
    }

    public com.iab.omid.library.bigosg.adsession.media.VastProperties a() {
        return this.e;
    }

    public Position getPosition() {
        return this.d;
    }

    public Float getSkipOffset() {
        return this.b;
    }

    public boolean isAutoPlay() {
        return this.c;
    }

    public boolean isSkippable() {
        return this.f6092a;
    }
}
