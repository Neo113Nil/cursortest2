package org.betup.ui.dialogs.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleResultAnimations.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/dialogs/compose/ParsedBattleAmount;", "", "prefix", "", "value", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;J)V", "getPrefix", "()Ljava/lang/String;", "getValue", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ParsedBattleAmount {
    public static final int $stable = 0;
    private final String prefix;
    private final long value;

    public static /* synthetic */ ParsedBattleAmount copy$default(ParsedBattleAmount parsedBattleAmount, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parsedBattleAmount.prefix;
        }
        if ((i & 2) != 0) {
            j = parsedBattleAmount.value;
        }
        return parsedBattleAmount.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    /* renamed from: component2, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public final ParsedBattleAmount copy(String prefix, long value) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return new ParsedBattleAmount(prefix, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedBattleAmount)) {
            return false;
        }
        ParsedBattleAmount parsedBattleAmount = (ParsedBattleAmount) other;
        return Intrinsics.areEqual(this.prefix, parsedBattleAmount.prefix) && this.value == parsedBattleAmount.value;
    }

    public int hashCode() {
        return (this.prefix.hashCode() * 31) + Long.hashCode(this.value);
    }

    public String toString() {
        return "ParsedBattleAmount(prefix=" + this.prefix + ", value=" + this.value + ")";
    }

    public ParsedBattleAmount(String prefix, long j) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.prefix = prefix;
        this.value = j;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final long getValue() {
        return this.value;
    }
}
