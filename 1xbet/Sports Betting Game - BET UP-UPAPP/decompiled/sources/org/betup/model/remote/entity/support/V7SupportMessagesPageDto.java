package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class V7SupportMessagesPageDto {

    @SerializedName("content")
    private List<V7SupportMessageWithReactionsDto> content;

    @SerializedName("numberOfElements")
    private Integer numberOfElements;

    @SerializedName("pageOptions")
    private V7SupportPageOptionsDto pageOptions;

    public List<V7SupportMessageWithReactionsDto> getContent() {
        return this.content;
    }

    public void setContent(List<V7SupportMessageWithReactionsDto> content) {
        this.content = content;
    }

    public V7SupportPageOptionsDto getPageOptions() {
        return this.pageOptions;
    }

    public void setPageOptions(V7SupportPageOptionsDto pageOptions) {
        this.pageOptions = pageOptions;
    }

    public Integer getNumberOfElements() {
        return this.numberOfElements;
    }

    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }
}
