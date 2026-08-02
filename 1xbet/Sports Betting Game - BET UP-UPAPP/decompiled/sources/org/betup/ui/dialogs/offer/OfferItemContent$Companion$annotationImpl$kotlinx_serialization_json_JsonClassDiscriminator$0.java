package org.betup.ui.dialogs.offer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonClassDiscriminator;

/* compiled from: OfferFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class OfferItemContent$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0 implements JsonClassDiscriminator {
    private final /* synthetic */ String discriminator;

    public OfferItemContent$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0(String discriminator) {
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        this.discriminator = discriminator;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return JsonClassDiscriminator.class;
    }

    @Override // kotlinx.serialization.json.JsonClassDiscriminator
    public final /* synthetic */ String discriminator() {
        return this.discriminator;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof JsonClassDiscriminator) && Intrinsics.areEqual(discriminator(), ((JsonClassDiscriminator) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return ("discriminator".hashCode() * 127) ^ this.discriminator.hashCode();
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=" + this.discriminator + ")";
    }
}
