package org.betup.model.remote.entity.support;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class V7SupportPageOptionsDto {

    @SerializedName("continuationToken")
    private String continuationToken;

    @SerializedName("direction")
    private String direction;

    @SerializedName("headId")
    private Long headId;

    @SerializedName("offset")
    private Integer offset;

    @SerializedName("pageSize")
    private Integer pageSize;

    @SerializedName("searchField")
    private String searchField;

    @SerializedName("searchTerm")
    private String searchTerm;

    @SerializedName("sortFields")
    private List<String> sortFields;

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Long getHeadId() {
        return this.headId;
    }

    public void setHeadId(Long headId) {
        this.headId = headId;
    }

    public String getSearchTerm() {
        return this.searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String getSearchField() {
        return this.searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    public List<String> getSortFields() {
        return this.sortFields;
    }

    public void setSortFields(List<String> sortFields) {
        this.sortFields = sortFields;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }
}
