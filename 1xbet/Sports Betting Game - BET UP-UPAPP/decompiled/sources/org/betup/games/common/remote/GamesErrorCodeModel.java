package org.betup.games.common.remote;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: GamesErrorCodeModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lorg/betup/games/common/remote/GamesErrorCodeModel;", "Ljava/io/Serializable;", "timestamp", "", "status", "", "error", "message", "path", "gameErrorCodes", "Lorg/betup/games/common/remote/GameErrorCodes;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/betup/games/common/remote/GameErrorCodes;)V", "getTimestamp", "()Ljava/lang/String;", "getStatus", "()I", "getError", "getMessage", "getPath", "getGameErrorCodes", "()Lorg/betup/games/common/remote/GameErrorCodes;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GamesErrorCodeModel implements Serializable {
    public static final int $stable = 0;
    private final String error;

    @SerializedName("errorCode")
    private final GameErrorCodes gameErrorCodes;
    private final String message;
    private final String path;
    private final int status;
    private final String timestamp;

    public static /* synthetic */ GamesErrorCodeModel copy$default(GamesErrorCodeModel gamesErrorCodeModel, String str, int i, String str2, String str3, String str4, GameErrorCodes gameErrorCodes, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gamesErrorCodeModel.timestamp;
        }
        if ((i2 & 2) != 0) {
            i = gamesErrorCodeModel.status;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = gamesErrorCodeModel.error;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = gamesErrorCodeModel.message;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = gamesErrorCodeModel.path;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            gameErrorCodes = gamesErrorCodeModel.gameErrorCodes;
        }
        return gamesErrorCodeModel.copy(str, i3, str5, str6, str7, gameErrorCodes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component6, reason: from getter */
    public final GameErrorCodes getGameErrorCodes() {
        return this.gameErrorCodes;
    }

    public final GamesErrorCodeModel copy(String timestamp, int status, String error, String message, String path, GameErrorCodes gameErrorCodes) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(gameErrorCodes, "gameErrorCodes");
        return new GamesErrorCodeModel(timestamp, status, error, message, path, gameErrorCodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GamesErrorCodeModel)) {
            return false;
        }
        GamesErrorCodeModel gamesErrorCodeModel = (GamesErrorCodeModel) other;
        return Intrinsics.areEqual(this.timestamp, gamesErrorCodeModel.timestamp) && this.status == gamesErrorCodeModel.status && Intrinsics.areEqual(this.error, gamesErrorCodeModel.error) && Intrinsics.areEqual(this.message, gamesErrorCodeModel.message) && Intrinsics.areEqual(this.path, gamesErrorCodeModel.path) && this.gameErrorCodes == gamesErrorCodeModel.gameErrorCodes;
    }

    public int hashCode() {
        return (((((((((this.timestamp.hashCode() * 31) + Integer.hashCode(this.status)) * 31) + this.error.hashCode()) * 31) + this.message.hashCode()) * 31) + this.path.hashCode()) * 31) + this.gameErrorCodes.hashCode();
    }

    public String toString() {
        return "GamesErrorCodeModel(timestamp=" + this.timestamp + ", status=" + this.status + ", error=" + this.error + ", message=" + this.message + ", path=" + this.path + ", gameErrorCodes=" + this.gameErrorCodes + ")";
    }

    public GamesErrorCodeModel(String timestamp, int i, String error, String message, String path, GameErrorCodes gameErrorCodes) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(gameErrorCodes, "gameErrorCodes");
        this.timestamp = timestamp;
        this.status = i;
        this.error = error;
        this.message = message;
        this.path = path;
        this.gameErrorCodes = gameErrorCodes;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPath() {
        return this.path;
    }

    public final GameErrorCodes getGameErrorCodes() {
        return this.gameErrorCodes;
    }
}
