package org.betup.games.webgame.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WebGameApiModels.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lorg/betup/games/webgame/model/WebGameSessionCodeModel;", "", "gameSessionCode", "", "expiresInSeconds", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;J)V", "getGameSessionCode", "()Ljava/lang/String;", "getExpiresInSeconds", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WebGameSessionCodeModel {
    public static final int $stable = 0;

    @SerializedName("expiresInSeconds")
    private final long expiresInSeconds;

    @SerializedName("gameSessionCode")
    private final String gameSessionCode;

    public static /* synthetic */ WebGameSessionCodeModel copy$default(WebGameSessionCodeModel webGameSessionCodeModel, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webGameSessionCodeModel.gameSessionCode;
        }
        if ((i & 2) != 0) {
            j = webGameSessionCodeModel.expiresInSeconds;
        }
        return webGameSessionCodeModel.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGameSessionCode() {
        return this.gameSessionCode;
    }

    /* renamed from: component2, reason: from getter */
    public final long getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    public final WebGameSessionCodeModel copy(String gameSessionCode, long expiresInSeconds) {
        Intrinsics.checkNotNullParameter(gameSessionCode, "gameSessionCode");
        return new WebGameSessionCodeModel(gameSessionCode, expiresInSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebGameSessionCodeModel)) {
            return false;
        }
        WebGameSessionCodeModel webGameSessionCodeModel = (WebGameSessionCodeModel) other;
        return Intrinsics.areEqual(this.gameSessionCode, webGameSessionCodeModel.gameSessionCode) && this.expiresInSeconds == webGameSessionCodeModel.expiresInSeconds;
    }

    public int hashCode() {
        return (this.gameSessionCode.hashCode() * 31) + Long.hashCode(this.expiresInSeconds);
    }

    public String toString() {
        return "WebGameSessionCodeModel(gameSessionCode=" + this.gameSessionCode + ", expiresInSeconds=" + this.expiresInSeconds + ")";
    }

    public WebGameSessionCodeModel(String gameSessionCode, long j) {
        Intrinsics.checkNotNullParameter(gameSessionCode, "gameSessionCode");
        this.gameSessionCode = gameSessionCode;
        this.expiresInSeconds = j;
    }

    public /* synthetic */ WebGameSessionCodeModel(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0L : j);
    }

    public final String getGameSessionCode() {
        return this.gameSessionCode;
    }

    public final long getExpiresInSeconds() {
        return this.expiresInSeconds;
    }
}
