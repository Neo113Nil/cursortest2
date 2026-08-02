package org.betup.model.remote.entity.matches.history;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchHistoryResponseModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lorg/betup/model/remote/entity/matches/history/NewMatchHistoryResponseModel;", "", "type", "", "categoryTitle", "categoryTitleAdditional", "matches", "", "Lorg/betup/model/remote/entity/matches/history/NewMatchHistoryMatchModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getCategoryTitle", "getCategoryTitleAdditional", "getMatches", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewMatchHistoryResponseModel {
    public static final int $stable = 8;

    @SerializedName("categoryTitle")
    private final String categoryTitle;

    @SerializedName("categoryTitleAdditional")
    private final String categoryTitleAdditional;

    @SerializedName("matches")
    private final List<NewMatchHistoryMatchModel> matches;

    @SerializedName("type")
    private final String type;

    public NewMatchHistoryResponseModel() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewMatchHistoryResponseModel copy$default(NewMatchHistoryResponseModel newMatchHistoryResponseModel, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newMatchHistoryResponseModel.type;
        }
        if ((i & 2) != 0) {
            str2 = newMatchHistoryResponseModel.categoryTitle;
        }
        if ((i & 4) != 0) {
            str3 = newMatchHistoryResponseModel.categoryTitleAdditional;
        }
        if ((i & 8) != 0) {
            list = newMatchHistoryResponseModel.matches;
        }
        return newMatchHistoryResponseModel.copy(str, str2, str3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCategoryTitleAdditional() {
        return this.categoryTitleAdditional;
    }

    public final List<NewMatchHistoryMatchModel> component4() {
        return this.matches;
    }

    public final NewMatchHistoryResponseModel copy(String type, String categoryTitle, String categoryTitleAdditional, List<NewMatchHistoryMatchModel> matches) {
        Intrinsics.checkNotNullParameter(matches, "matches");
        return new NewMatchHistoryResponseModel(type, categoryTitle, categoryTitleAdditional, matches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMatchHistoryResponseModel)) {
            return false;
        }
        NewMatchHistoryResponseModel newMatchHistoryResponseModel = (NewMatchHistoryResponseModel) other;
        return Intrinsics.areEqual(this.type, newMatchHistoryResponseModel.type) && Intrinsics.areEqual(this.categoryTitle, newMatchHistoryResponseModel.categoryTitle) && Intrinsics.areEqual(this.categoryTitleAdditional, newMatchHistoryResponseModel.categoryTitleAdditional) && Intrinsics.areEqual(this.matches, newMatchHistoryResponseModel.matches);
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categoryTitleAdditional;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.matches.hashCode();
    }

    public String toString() {
        return "NewMatchHistoryResponseModel(type=" + this.type + ", categoryTitle=" + this.categoryTitle + ", categoryTitleAdditional=" + this.categoryTitleAdditional + ", matches=" + this.matches + ")";
    }

    public NewMatchHistoryResponseModel(String str, String str2, String str3, List<NewMatchHistoryMatchModel> matches) {
        Intrinsics.checkNotNullParameter(matches, "matches");
        this.type = str;
        this.categoryTitle = str2;
        this.categoryTitleAdditional = str3;
        this.matches = matches;
    }

    public final String getType() {
        return this.type;
    }

    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    public final String getCategoryTitleAdditional() {
        return this.categoryTitleAdditional;
    }

    public final List<NewMatchHistoryMatchModel> getMatches() {
        return this.matches;
    }

    public /* synthetic */ NewMatchHistoryResponseModel(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }
}
