package com.facebook.share.internal;

/* loaded from: classes2.dex */
public class GameRequestValidation {
    public static void validate(com.facebook.share.model.GameRequestContent content) {
        com.facebook.internal.Validate.notNull(content.getMessage(), "message");
        if ((content.getObjectId() != null) ^ (content.getActionType() == com.facebook.share.model.GameRequestContent.ActionType.ASKFOR || content.getActionType() == com.facebook.share.model.GameRequestContent.ActionType.SEND)) {
            throw new java.lang.IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
        }
        int i = content.getRecipients() != null ? 1 : 0;
        if (content.getSuggestions() != null) {
            i++;
        }
        if (content.getFilters() != null) {
            i++;
        }
        if (i > 1) {
            throw new java.lang.IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
        }
    }
}
