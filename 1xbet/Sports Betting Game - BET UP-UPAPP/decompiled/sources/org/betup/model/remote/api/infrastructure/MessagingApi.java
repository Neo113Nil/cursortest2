package org.betup.model.remote.api.infrastructure;

import java.util.List;
import okhttp3.ResponseBody;
import org.betup.model.remote.entity.PageModel;
import org.betup.model.remote.entity.messaging.ChatInfoModel;
import org.betup.model.remote.entity.messaging.ChatModel;
import org.betup.model.remote.entity.messaging.CorrespondentModel;
import org.betup.model.remote.entity.messaging.ExtendedMessageModel;
import org.betup.model.remote.entity.messaging.MessageModel;
import org.betup.model.remote.entity.messaging.ReactionModel;
import org.betup.model.remote.entity.messaging.UserCorrespondentModel;
import org.betup.model.remote.entity.support.ChatReadStatusDto;
import org.betup.model.remote.entity.support.CreateSupportChatDto;
import org.betup.model.remote.entity.support.MessageExposeDto;
import org.betup.model.remote.entity.support.MessageWithReactionsDto;
import org.betup.model.remote.entity.support.SupportCategoryDto;
import org.betup.model.remote.entity.support.SupportChatDto;
import org.betup.model.remote.entity.support.SupportUserExposeDto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* loaded from: classes2.dex */
public interface MessagingApi {
    @POST("public/messages/{id}/comments")
    Call<MessageModel> addCommentToMessage(@Header("auth") String token, @Path("id") long messageId, @Body String text);

    @DELETE("support/chats/{chatId}")
    Call<ResponseBody> closeSupportChat(@Header("auth") String token, @Path("chatId") String chatId);

    @POST("support/chats")
    Call<SupportChatDto> createSupportChat(@Header("auth") String token, @Body CreateSupportChatDto request);

    @DELETE("reactions/messages/{messageId}")
    Call<ExtendedMessageModel> deleteReactionToMessage(@Header("auth") String token, @Path("messageId") long id);

    @GET("chats/")
    Call<PageModel<ChatModel>> getChats(@Header("auth") String token, @Query("page") int page);

    @GET("public/messages/{id}/comments")
    Call<PageModel<ExtendedMessageModel>> getCommentsForMessage(@Header("auth") String token, @Path("id") long messageId, @Query("page") int page);

    @GET("users/{id}")
    Call<CorrespondentModel> getCorrespondent(@Header("auth") String token, @Path("id") Long id);

    @GET("users/me/")
    Call<UserCorrespondentModel> getMe(@Header("auth") String token);

    @GET("public/messages/{messageId}")
    Call<ExtendedMessageModel> getMessageDetails(@Header("auth") String token, @Path("messageId") long messageId);

    @GET("users/{id}/messages")
    Call<PageModel<ExtendedMessageModel>> getPrivateMessages(@Header("auth") String token, @Path("id") long userId, @Query("continuationToken") String continuationToken);

    @GET("public/chats/{chatId}/info")
    Call<ChatInfoModel> getPublicChatInfo(@Header("auth") String token, @Path("chatId") long chatId);

    @GET("public/chats/{chatId}/messages")
    Call<PageModel<ExtendedMessageModel>> getPublicChatMessages(@Header("auth") String token, @Path("chatId") long chatId, @Query("page") int page);

    @GET("reactions/all")
    Call<List<ReactionModel>> getReactions(@Header("auth") String token);

    @GET("support/categories")
    Call<List<SupportCategoryDto>> getSupportCategories(@Header("auth") String token, @Query("lang") String lang);

    @GET("support/chats/{chatId}")
    Call<SupportChatDto> getSupportChat(@Header("auth") String token, @Path("chatId") String chatId);

    @GET("support/chats/{chatId}/messages")
    Call<PageModel<MessageWithReactionsDto>> getSupportChatMessages(@Header("auth") String token, @Path("chatId") String chatId, @Query("page") Integer page, @Query("size") Integer size, @Query("sort") String sort, @Query("continuationToken") String continuationToken);

    @GET("support/chats/readStatus")
    Call<List<ChatReadStatusDto>> getSupportChatReadStatus(@Header("auth") String token, @Query("chatIds") List<Long> chatIds);

    @GET("support/chats")
    Call<PageModel<SupportChatDto>> getSupportChats(@Header("auth") String token, @Query("page") Integer page, @Query("size") Integer size, @Query("sort") String sort);

    @GET("support/info")
    Call<SupportUserExposeDto> getSupportInfo(@Header("auth") String token);

    @POST("reactions/messages/{messageId}")
    Call<ExtendedMessageModel> postReactionToMessage(@Header("auth") String token, @Path("messageId") long id, @Body ReactionModel reaction);

    @GET("users/search")
    Call<PageModel<CorrespondentModel>> searchUsersByName(@Query("q") String query, @Query("continuationToken") String continuationToken);

    @POST("users/{id}/messages")
    Call<MessageModel> sendPrivateMessage(@Header("auth") String token, @Path("id") long userId, @Body String message);

    @POST("public/chats/{chatId}/messages")
    Call<MessageModel> sendPublicChatMessages(@Header("auth") String token, @Path("chatId") long chatId, @Body String message);

    @POST("support/chats/{chatId}/messages")
    Call<MessageExposeDto> sendSupportChatMessage(@Header("auth") String token, @Path("chatId") String chatId, @Body String message);
}
