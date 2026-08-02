package org.betup.bus;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PrivateChallengeStartMessage.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/betup/bus/PrivateChallengeStartMessage;", "", "dataModel", "", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/Map;)V", "getDataModel", "()Ljava/util/Map;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PrivateChallengeStartMessage {
    public static final int $stable = 8;
    private final Map<String, String> dataModel;

    public PrivateChallengeStartMessage(Map<String, String> dataModel) {
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        this.dataModel = dataModel;
    }

    public final Map<String, String> getDataModel() {
        return this.dataModel;
    }
}
