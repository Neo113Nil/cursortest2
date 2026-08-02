package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000f\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerWithPrettyPrint;", "Lkotlinx/serialization/json/internal/Composer;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/json/Json;)V", "", "indent", "()V", "unIndent", "nextItem", "nextItemIfNotFirst", "space", "getHighSpeedVideoSizes", "Lkotlinx/serialization/json/Json;", "getHighSpeedVideoFpsRangesFor", "", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposerWithPrettyPrint extends kotlinx.serialization.json.internal.Composer {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerWithPrettyPrint(kotlinx.serialization.json.internal.InternalJsonWriter internalJsonWriter, kotlinx.serialization.json.Json json) {
        super(internalJsonWriter);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalJsonWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.getHighSpeedVideoFpsRangesFor = json;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void indent() {
        setWritingFirst(true);
        this.getHighSpeedVideoSizes++;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void unIndent() {
        this.getHighSpeedVideoSizes--;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void nextItem() {
        setWritingFirst(false);
        print(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        int i = this.getHighSpeedVideoSizes;
        for (int i2 = 0; i2 < i; i2++) {
            print(this.getHighSpeedVideoFpsRangesFor.getConfiguration().getPrettyPrintIndent());
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void nextItemIfNotFirst() {
        if (getWritingFirst()) {
            setWritingFirst(false);
        } else {
            nextItem();
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public final void space() {
        print(' ');
    }
}
