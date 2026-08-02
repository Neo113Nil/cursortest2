package org.betup.games;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil3.ComponentRegistry;
import coil3.Image;
import coil3.ImageLoader;
import coil3.Image_androidKt;
import coil3.request.ImageRequest;
import coil3.svg.SvgDecoder;
import coil3.target.Target;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.games.GameListFragmentAdapter;
import org.betup.games.GameListItem;
import org.betup.ui.views.AlphaPressButton;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: GameListFragmentAdapter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lorg/betup/games/GameListFragmentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/betup/games/GameListFragmentAdapter$GameViewHolder;", "context", "Landroid/content/Context;", "itemListener", "Lorg/betup/games/GameListTapListener;", "sideSize", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Lorg/betup/games/GameListTapListener;I)V", "gameList", "", "Lorg/betup/games/GameListItem;", "getItemViewType", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "addNewItems", "", "list", "onBindViewHolder", "gameViewHolder", "getItemCount", "GameViewHolder", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GameListFragmentAdapter extends RecyclerView.Adapter<GameViewHolder> {
    private final Context context;
    private List<? extends GameListItem> gameList;
    private final GameListTapListener itemListener;
    private final int sideSize;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return 0;
    }

    public GameListFragmentAdapter(Context context, GameListTapListener itemListener, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemListener, "itemListener");
        this.context = context;
        this.itemListener = itemListener;
        this.sideSize = i;
        this.gameList = CollectionsKt.emptyList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GameViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(this.context).inflate(R.layout.item_game_view_holder, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        layoutParams.height = this.sideSize;
        layoutParams.width = this.sideSize;
        inflate.setLayoutParams(layoutParams);
        Intrinsics.checkNotNull(inflate);
        return new GameViewHolder(inflate, this.itemListener, this.context);
    }

    public final void addNewItems(List<? extends GameListItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.gameList = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GameViewHolder gameViewHolder, int position) {
        Intrinsics.checkNotNullParameter(gameViewHolder, "gameViewHolder");
        gameViewHolder.initHolder(this.gameList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.gameList.isEmpty()) {
            return 0;
        }
        return this.gameList.size();
    }

    /* compiled from: GameListFragmentAdapter.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \f*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lorg/betup/games/GameListFragmentAdapter$GameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemViewHolder", "Landroid/view/View;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/games/GameListTapListener;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/view/View;Lorg/betup/games/GameListTapListener;Landroid/content/Context;)V", "gameIcon", "Lorg/betup/ui/views/AlphaPressButton;", "kotlin.jvm.PlatformType", "gameCover", "Landroidx/appcompat/widget/AppCompatImageView;", "gameTitle", "Landroid/widget/TextView;", "gameTitleScrim", "imageLoader", "Lcoil3/ImageLoader;", "targetGame", "Lorg/betup/bus/NavigateMessage$TargetGame;", "webItem", "Lorg/betup/games/GameListItem$Web;", "initHolder", "", "item", "Lorg/betup/games/GameListItem;", "showGameTitle", "name", "", "hideGameTitle", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GameViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private final Context context;
        private final AppCompatImageView gameCover;
        private final AlphaPressButton gameIcon;
        private final TextView gameTitle;
        private final View gameTitleScrim;
        private final ImageLoader imageLoader;
        private final GameListTapListener listener;
        private NavigateMessage.TargetGame targetGame;
        private GameListItem.Web webItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GameViewHolder(View itemViewHolder, GameListTapListener listener, Context context) {
            super(itemViewHolder);
            Intrinsics.checkNotNullParameter(itemViewHolder, "itemViewHolder");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(context, "context");
            this.listener = listener;
            this.context = context;
            AlphaPressButton alphaPressButton = (AlphaPressButton) this.itemView.findViewById(R.id.gameIcon);
            this.gameIcon = alphaPressButton;
            this.gameCover = (AppCompatImageView) this.itemView.findViewById(R.id.gameCover);
            this.gameTitle = (TextView) this.itemView.findViewById(R.id.gameTitle);
            this.gameTitleScrim = this.itemView.findViewById(R.id.gameTitleScrim);
            this.imageLoader = GameListFragmentAdapter.INSTANCE.buildImageLoader(context);
            alphaPressButton.setOnClickListener(new View.OnClickListener() { // from class: org.betup.games.GameListFragmentAdapter$GameViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GameListFragmentAdapter.GameViewHolder._init_$lambda$0(GameListFragmentAdapter.GameViewHolder.this, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(GameViewHolder gameViewHolder, View view) {
            GameListItem.Web web = gameViewHolder.webItem;
            NavigateMessage.TargetGame targetGame = gameViewHolder.targetGame;
            if (web != null) {
                gameViewHolder.listener.onWebGameClicked(web);
            } else if (targetGame != null) {
                gameViewHolder.listener.onNativeGameClicked(targetGame);
            }
        }

        public final void initHolder(GameListItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            final String str = null;
            this.webItem = null;
            this.targetGame = null;
            if (item instanceof GameListItem.Native) {
                GameListItem.Native r3 = (GameListItem.Native) item;
                this.gameCover.setImageDrawable(r3.getDrawable());
                this.targetGame = r3.getTargetGame();
                hideGameTitle();
                return;
            }
            if (!(item instanceof GameListItem.Web)) {
                throw new NoWhenBranchMatchedException();
            }
            GameListItem.Web web = (GameListItem.Web) item;
            this.webItem = web;
            showGameTitle(web.getName());
            this.gameCover.setImageDrawable(null);
            String coverImageUrl = web.getCoverImageUrl();
            if (coverImageUrl != null && !StringsKt.isBlank(coverImageUrl)) {
                str = coverImageUrl;
            }
            if (str != null) {
                this.gameIcon.setTag(str);
                this.imageLoader.enqueue(new ImageRequest.Builder(this.context).data(str).target(new Target(str, this, str) { // from class: org.betup.games.GameListFragmentAdapter$GameViewHolder$initHolder$$inlined$target$default$1
                    final /* synthetic */ String $url$inlined;
                    final /* synthetic */ String $url$inlined$1;

                    @Override // coil3.target.Target
                    public void onStart(Image placeholder) {
                    }

                    {
                        this.$url$inlined$1 = str;
                    }

                    @Override // coil3.target.Target
                    public void onError(Image error) {
                        AlphaPressButton alphaPressButton;
                        AppCompatImageView appCompatImageView;
                        alphaPressButton = GameListFragmentAdapter.GameViewHolder.this.gameIcon;
                        if (Intrinsics.areEqual(alphaPressButton.getTag(), this.$url$inlined)) {
                            appCompatImageView = GameListFragmentAdapter.GameViewHolder.this.gameCover;
                            appCompatImageView.setImageDrawable(null);
                        }
                    }

                    @Override // coil3.target.Target
                    public void onSuccess(Image result) {
                        AlphaPressButton alphaPressButton;
                        AppCompatImageView appCompatImageView;
                        Context context;
                        alphaPressButton = GameListFragmentAdapter.GameViewHolder.this.gameIcon;
                        if (Intrinsics.areEqual(alphaPressButton.getTag(), this.$url$inlined$1)) {
                            appCompatImageView = GameListFragmentAdapter.GameViewHolder.this.gameCover;
                            context = GameListFragmentAdapter.GameViewHolder.this.context;
                            Resources resources = context.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            appCompatImageView.setImageDrawable(Image_androidKt.asDrawable(result, resources));
                        }
                    }
                }).build());
            }
        }

        private final void showGameTitle(String name) {
            String obj = StringsKt.trim((CharSequence) name).toString();
            if (obj.length() == 0) {
                hideGameTitle();
                return;
            }
            this.gameTitle.setText(obj);
            this.gameTitle.setVisibility(0);
            this.gameTitleScrim.setVisibility(0);
            this.gameIcon.setContentDescription(obj);
        }

        private final void hideGameTitle() {
            this.gameTitle.setText("");
            this.gameTitle.setVisibility(8);
            this.gameTitleScrim.setVisibility(8);
            this.gameIcon.setContentDescription(null);
        }
    }

    /* compiled from: GameListFragmentAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"Lorg/betup/games/GameListFragmentAdapter$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "buildImageLoader", "Lcoil3/ImageLoader;", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ImageLoader buildImageLoader(Context context) {
            ImageLoader.Builder builder = new ImageLoader.Builder(context);
            ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
            builder2.add(new SvgDecoder.Factory(false, false, false, 7, null));
            return builder.components(builder2.build()).build();
        }
    }
}
