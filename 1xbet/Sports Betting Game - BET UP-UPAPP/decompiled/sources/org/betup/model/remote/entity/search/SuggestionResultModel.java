package org.betup.model.remote.entity.search;

import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class SuggestionResultModel {

    @SerializedName(ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS)
    private List<Suggestion> suggestions;

    public List<Suggestion> getSuggestions() {
        return this.suggestions;
    }

    public void setSuggestions(List<Suggestion> suggestions) {
        this.suggestions = suggestions;
    }
}
